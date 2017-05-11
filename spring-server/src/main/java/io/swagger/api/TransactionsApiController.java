package io.swagger.api;

import io.swagger.model.InlineResponse2001;
import io.swagger.model.Payment;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-11T20:19:35.562Z")

@Controller
public class TransactionsApiController implements TransactionsApi {



    public ResponseEntity<InlineResponse2001> transactionsPost(@ApiParam(value = "Payment information."  ) @RequestBody Payment payment) {
        // do some magic!
        return new ResponseEntity<InlineResponse2001>(HttpStatus.OK);
    }

}
