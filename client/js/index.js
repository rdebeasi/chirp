(function() {
  // TODO: implement real API
  var messages = [
    {
      "message": "Donation 2",
      "amount": 2
    },
    {
      "message": "Donation 3",
      "amount": 3
    },
    {
      "message": "Donation 4",
      "amount": 4
    },
    {
      "message": "Donation 5",
      "amount": 5
    },
    {
      "message": "Donation 6",
      "amount": 6
    },
    {
      "message": "Donation 7",
      "amount": 7
    },
    {
      "message": "Donation 8",
      "amount": 8
    },
    {
      "message": "Donation 9",
      "amount": 9
    },
    {
      "message": "string",
      "amount": 999
    }
  ];


  var app = new Vue({
    el: '#app',
    data: {
      messages: messages
    }
  });

})();
