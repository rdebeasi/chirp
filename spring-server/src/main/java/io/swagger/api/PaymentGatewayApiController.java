package io.swagger.api;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import io.swagger.annotations.ApiParam;
import io.swagger.model.PaymentGateway;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T01:38:34.826Z")

@Controller
public class PaymentGatewayApiController implements PaymentGatewayApi {

	List<PaymentGateway> list = new CopyOnWriteArrayList<PaymentGateway>();

	public ResponseEntity<PaymentGateway> paymentGatewayPost(
			@ApiParam(value = "Payment information from client. Transaction ID is empty.") @RequestBody PaymentGateway paymentGateway) {
		paymentGateway.setTransactionId(UUID.randomUUID());
		
		list.add(paymentGateway);
		
		return new ResponseEntity<PaymentGateway>(paymentGateway, HttpStatus.OK);
	}

}
