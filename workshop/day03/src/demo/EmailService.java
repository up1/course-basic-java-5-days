package demo;

class MyEmail {
    String targetEmail;
    String subject;
    String body;

    public MyEmail(String targetEmail, String subject, String body) {
        this.targetEmail = targetEmail;
        this.subject = subject;
        this.body = body;
    }
}

public class EmailService {
    public boolean sendEmail(MyEmail request) {
        System.out.println(request.subject);
        return false;
    }
}
