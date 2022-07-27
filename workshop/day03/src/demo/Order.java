package demo;

final class Constants {
    public static final int ORDER_STATUS_COMPLETED = 1;
    public static final int ORDER_STATUS_WAITING = 2;
    public static final int ORDER_STATUS_DELIVERED = 3;
    public static final int ORDER_STATUS_CANCELED = 4;
}

enum OrderStatus {
    Completed,
    Waiting,
    Delivered,
    Canceled
}

public abstract class Order {
    String customerEmail;
    OrderStatus orderStatus;

    abstract String getSubject();
    abstract String getBody();
}

class OrderWaiting extends Order {

    @Override
    String getSubject() {
        return "Subject for waiting";
    }

    @Override
    String getBody() {
        return "Body for waiting";
    }
}
