package io.swagger.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.Donation;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T01:38:34.826Z")

@Api(value = "donation", description = "the donation API")
public interface DonationApi {

    @ApiOperation(value = "Return recent messages.", notes = "", response = Object.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of messages. transactionId may be empty.", responseContainer = "List", response = Donation.class) })
    @RequestMapping(value = "/donation",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Donation>> donationGet();


    @ApiOperation(value = "Add a new message.", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Void.class),
        @ApiResponse(code = 403, message = "Improperly formatted post", response = Void.class) })
    @RequestMapping(value = "/donation",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Donation> donationPost(@ApiParam(value = "Message with optional donation."  ) @RequestBody Donation donation);

}
