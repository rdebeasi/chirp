package io.swagger.api;

import io.swagger.model.InlineResponse200;
import io.swagger.model.Message;

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
public class MessagesApiController implements MessagesApi {



    public ResponseEntity<List<InlineResponse200>> messagesGet() {
        // do some magic!
        return new ResponseEntity<List<InlineResponse200>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> messagesPost(@ApiParam(value = "Message with optional donation."  ) @RequestBody Message message) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
