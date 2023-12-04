package tiagocarleial.github.io.awsemailservice.core.exceptions;

import tiagocarleial.github.io.awsemailservice.application.EmailSenderService;

public class EmailSenderException extends RuntimeException{

    public EmailSenderException(String message) {
        super(message);
    }

    public EmailSenderException(String message, Throwable cause) {
        super(message, cause);
    }
}
