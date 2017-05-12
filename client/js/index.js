'use strict';

(function () {
  // https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Strict_mode

  // In a larger application, we'd use ES6 modules to import Vue and Axios.
  // For now, we're including them in script tags, making them available globally.
  //
  // We wrap our code in an IIFE to prevent our variables from leaking into global
  // scope. http://benalman.com/news/2010/11/immediately-invoked-function-expression/

  // TODO: Switch back before committing!
  var apiBase = 'http://api.apps.ehealth.rht-labs.com/v1/';

  // Create a viewModel, using the Vue constructor function.
  var vm = new Vue({
    el: '#app',
    data: {
      // Vue will update the view when these variables are changed.
      messages: [],
      draft: {
        message: '',
        card: '',
        amount: ''
      },
      alert: {
        type: 'info', // One of: success, info, warning, danger
        text: ''
      }
    },
    methods: {
      // In a Vue method, `this` is the viewModel.
      clearAlert: function () {
        this.alert.text = '';
        this.alert.type = 'info';
      },
      validate: function () {
        // With ES6, we can use arrow functions to avoid having to save a reference to this.
        var self = this;
        // In a larger app, we would use a library such as Vuelidate.
        return new Promise(function (resolve, reject) {
          if (self.draft.card === '') {
            return reject(Error('Card number is required.'));
          }
          if (isNaN(self.draft.amount)) {
            // The web browser may catch this error for us.
            return reject(Error('Amount must be a number.'));
          }
          if (self.draft.amount <= 0) {
            return reject(Error('Amount must be positive.'));
          }
          return resolve();
        });
      },
      makePayment: function () {
        return axios.post(apiBase + 'payment-gateway', {
          amount: this.draft.amount,
          cardNumber: this.draft.card
        });
      },
      sendMessage: function (transaction) {
        return axios.post(apiBase + 'donation', {
          amount: this.draft.amount,
          message: this.draft.message,
          transactionId: transaction.data.transactionId
        });
      },
      handleError: function (error) {
        this.alert.type = 'danger';
        this.alert.text = error.message;
      },
      handleSuccess: function () {
        this.alert.type = 'success';
        this.alert.text = 'Your message and donation have been sent! Thank you! :)';
      },
      showSuccess: function (donation) {
        // Add message to the beginning of the array.
        this.messages.unshift(donation.data);
      },
      onSubmit: function () {
        this.validate()
          .then(this.makePayment)
          .then(this.sendMessage)
          .then(this.showSuccess)
          .then(this.handleSuccess)
          .catch(this.handleError);
      }
    },
    created: function () {
      axios.get(apiBase + 'donation')
        .then(function (response) {
          // Store messages in reverse-chronological order.
          vm.messages = response.data.reverse();
        })
        .catch(this.handleError);
    }
  });
}());
