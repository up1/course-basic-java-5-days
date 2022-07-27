package demo;

class EmailRequest {
    String targetEmail;
    String subject;
    String body;

    public EmailRequest(String targetEmail, String subject, String body) {
        this.targetEmail = targetEmail;
        this.subject = subject;
        this.body = body;
    }
}

public class EmailService {
    public boolean sendEmail(EmailRequest request) {
        System.out.println(request.subject);
        return false;
    }
}
