package demo;

public class OrderMgt {
    public static void main(String[] args) {
        Order order1 = new Order();
        order1.orderStatus = OrderStatus.Completed;
        order1.customerEmail = "xxx@xxx.com";

        String subject = "";
        String body = "";
        if(order1.orderStatus == OrderStatus.Completed) {
            subject = "Subject for completed";
            body = "Body for completed";
        }
        EmailService service = new EmailService();
        EmailRequest request = new EmailRequest(
                order1.customerEmail,
                subject, body
        );
        service.sendEmail(request);
    }
}
