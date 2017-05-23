package io.swagger.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.PaymentGateway;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T01:38:34.826Z")

@Api(value = "payment-gateway", description = "the payment-gateway API")
public interface PaymentGatewayApi {

    @ApiOperation(value = "Process a donation.", notes = "", response = Object.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "transactionId", response = Object.class),
        @ApiResponse(code = 403, message = "Improperly formatted post", response = Object.class) })
    @RequestMapping(value = "/payment-gateway",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<PaymentGateway> paymentGatewayPost(@ApiParam(value = "Payment information from client. Transaction ID is empty."  ) @RequestBody PaymentGateway paymentGateway);

}
