package tiagocarleial.github.io.awsemailservice.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tiagocarleial.github.io.awsemailservice.core.exceptions.EmailResquest;
import tiagocarleial.github.io.awsemailservice.core.exceptions.EmailSenderException;

@RestController
@RequestMapping("/emailSend")
public class EmailSenderController {

    private final EmailSenderService emailSenderService;

    @Autowired
    public EmailSenderController(EmailSenderService emailService) {
        this.emailSenderService = emailService;
    }

    @PostMapping
    public ResponseEntity<String> sendEmail(@RequestBody EmailResquest request){

        try {
            this.emailSenderService.sendEmail(request.to(), request.subject(), request.body());
            return ResponseEntity.ok(" Email sent succesfully.");
        } catch (EmailSenderException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error while sending email.");

        }
    }
}
