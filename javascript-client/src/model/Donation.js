/**
 * Chirp API
 * API for a social network with donations.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.ChirpApi) {
      root.ChirpApi = {};
    }
    root.ChirpApi.Donation = factory(root.ChirpApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The Donation model module.
   * @module model/Donation
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>Donation</code>.
   * @alias module:model/Donation
   * @class
   * @param amount {Number} 
   * @param currency {module:model/Donation.CurrencyEnum} 
   * @param orgCode {String} 
   * @param orgName {String} 
   */
  var exports = function(amount, currency, orgCode, orgName) {
    var _this = this;

    _this['amount'] = amount;
    _this['currency'] = currency;
    _this['orgCode'] = orgCode;
    _this['orgName'] = orgName;

  };

  /**
   * Constructs a <code>Donation</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Donation} obj Optional instance to populate.
   * @return {module:model/Donation} The populated <code>Donation</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('amount')) {
        obj['amount'] = ApiClient.convertToType(data['amount'], 'Number');
      }
      if (data.hasOwnProperty('currency')) {
        obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
      }
      if (data.hasOwnProperty('orgCode')) {
        obj['orgCode'] = ApiClient.convertToType(data['orgCode'], 'String');
      }
      if (data.hasOwnProperty('orgName')) {
        obj['orgName'] = ApiClient.convertToType(data['orgName'], 'String');
      }
      if (data.hasOwnProperty('transactionId')) {
        obj['transactionId'] = ApiClient.convertToType(data['transactionId'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {Number} amount
   */
  exports.prototype['amount'] = undefined;
  /**
   * @member {module:model/Donation.CurrencyEnum} currency
   */
  exports.prototype['currency'] = undefined;
  /**
   * @member {String} orgCode
   */
  exports.prototype['orgCode'] = undefined;
  /**
   * @member {String} orgName
   */
  exports.prototype['orgName'] = undefined;
  /**
   * @member {String} transactionId
   */
  exports.prototype['transactionId'] = undefined;


  /**
   * Allowed values for the <code>currency</code> property.
   * @enum {String}
   * @readonly
   */
  exports.CurrencyEnum = {
    /**
     * value: "USD"
     * @const
     */
    "USD": "USD",
    /**
     * value: "GBP"
     * @const
     */
    "GBP": "GBP",
    /**
     * value: "EUR"
     * @const
     */
    "EUR": "EUR"  };


  return exports;
}));


