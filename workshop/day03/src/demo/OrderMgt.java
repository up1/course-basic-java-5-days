package demo;

public class OrderMgt {
    public static void main(String[] args) {
        Order order1 = new Order();
        order1.orderStatus = OrderStatus.Waiting;
        order1.customerEmail = "xxx@xxx.com";

        String subject = "";
        String body = "";
        if(order1.orderStatus == OrderStatus.Completed) {
            subject = "Subject for completed";
            body = "Body for completed";
        } else if(order1.orderStatus == OrderStatus.Waiting) {
            subject = "Subject for waiting";
            body = "Body for waiting";
        } else if(order1.orderStatus == OrderStatus.Delivered) {
            subject = "Subject for delivered";
            body = "Body for delivered";
        } else if(order1.orderStatus == OrderStatus.Canceled) {
            subject = "Subject for cancel";
            body = "Body for cancel";
        } else {
            // Not support
        }
        EmailService service = new EmailService();
        EmailRequest request = new EmailRequest(
                order1.customerEmail,
                subject, body
        );
        service.sendEmail(request);
    }
}
