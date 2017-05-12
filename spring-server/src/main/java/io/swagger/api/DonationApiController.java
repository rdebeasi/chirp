package io.swagger.api;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import io.swagger.annotations.ApiParam;
import io.swagger.model.Donation;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T01:38:34.826Z")

@Controller
public class DonationApiController implements DonationApi {

	List<Donation> list = new CopyOnWriteArrayList<Donation>();

	@PostConstruct
	public void init() {
		Donation d = null;

		for (int i = 2; i < 10; i++) {
			d = new Donation();
			d.setAmount(Float.parseFloat(i + ""));
			d.setMessage("Donation " + i);
			list.add(d);
		}
	}

	public ResponseEntity<List<Donation>> donationGet() {

		return new ResponseEntity<List<Donation>>(list, HttpStatus.OK);
	}

	public ResponseEntity<Donation> donationPost(
			@ApiParam(value = "Message with optional donation.") @RequestBody Donation donation) {
		
		list.add(donation);
		
		return new ResponseEntity<Donation>(donation,HttpStatus.OK);
	}

}
