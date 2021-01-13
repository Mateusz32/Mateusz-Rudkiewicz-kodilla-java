package Food2Door;

public class OrderDto {

    OrderRequestRetriever orderRequestRetriever;
    boolean isOrdered;

    public OrderDto(OrderRequestRetriever orderRequestRetriever, boolean isOrdered) {
        this.orderRequestRetriever = orderRequestRetriever;
        this.isOrdered = isOrdered;
    }

    public OrderRequestRetriever getOrderRequestRetriever() {
        return orderRequestRetriever;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
