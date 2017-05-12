(function() {
  // In a larger application, we'd use ES6 modules to import Vue and Axios.
  // For now, we're including them in script tags, making them available globally.
  //
  // We wrap our code in an IIFE to prevent our variables from leaking into global
  // scope. http://benalman.com/news/2010/11/immediately-invoked-function-expression/

  var apiBase = 'http://localhost:8080/v1/';

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
      }
    },
    methods: {
      makePayment: function() {
        return axios.post(apiBase + 'payment-gateway', {
          amount: this.draft.amount,
          cardNumber: this.draft.card
        });
      },
      sendMessage: function( transaction ) {
        return axios.post(apiBase + 'donation', {
          amount: this.draft.amount,
          message: this.draft.message,
          transactionId: transaction.data.transactionId
        });
      },
      showSuccess: function(stuff) {
        // Add message to the beginning of the array.
        this.messages.unshift( stuff.data );
        console.log('success', stuff);
      },
      onSubmit: function(event) {
        // With a Vue method, `this` is the viewModel.
        // console.log(typeof this.draft.amount);
        this.makePayment()
          .then( this.sendMessage )
          .then( this.showSuccess )
          .catch( function(error) { console.log(error) });
      }
    }
  });

  axios.get(apiBase + 'donation')
    .then(function(response) {
      // Store messages in reverse-chronological order.
      vm.messages = response.data.reverse();
      console.log(vm.messages);
    })
    .catch(function(error) {
      console.log(error);
    });
})();
