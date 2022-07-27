package demo;

public class OrderMgt {
    public static void main(String[] args) {
        Order order1 = new OrderWaiting();
        order1.customerEmail = "xxx@xxx.com";

        EmailService service = new EmailService();
        MyEmail request = new MyEmail(
                order1.customerEmail,
                order1.getSubject(), order1.getBody()
        );
        service.sendEmail(request);
    }
}
