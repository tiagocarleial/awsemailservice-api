package tiagocarleial.github.io.awsemailservice.adapters;

public interface EmailSenderGateway {

    void sendEmail(String to, String subject, String body);

}
