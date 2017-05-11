# ChirpApi.DefaultApi

All URIs are relative to *https://api.example.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**messagesGet**](DefaultApi.md#messagesGet) | **GET** /messages | Return recent messages.
[**messagesPost**](DefaultApi.md#messagesPost) | **POST** /messages | Add a new message.
[**transactionsPost**](DefaultApi.md#transactionsPost) | **POST** /transactions | Process a donation.


<a name="messagesGet"></a>
# **messagesGet**
> [InlineResponse200] messagesGet()

Return recent messages.

### Example
```javascript
var ChirpApi = require('chirp_api');

var apiInstance = new ChirpApi.DefaultApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.messagesGet(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**[InlineResponse200]**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="messagesPost"></a>
# **messagesPost**
> messagesPost(opts)

Add a new message.

### Example
```javascript
var ChirpApi = require('chirp_api');

var apiInstance = new ChirpApi.DefaultApi();

var opts = { 
  'message': new ChirpApi.Message() // Message | Message with optional donation.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.messagesPost(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message** | [**Message**](Message.md)| Message with optional donation. | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="transactionsPost"></a>
# **transactionsPost**
> InlineResponse2001 transactionsPost(opts)

Process a donation.

### Example
```javascript
var ChirpApi = require('chirp_api');

var apiInstance = new ChirpApi.DefaultApi();

var opts = { 
  'message': new ChirpApi.Message1() // Message1 | Payment information.
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.transactionsPost(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message** | [**Message1**](Message1.md)| Payment information. | [optional] 

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

