package Food2Door;

public class OrderedDto {

    OrderRequestFromClient orderRequestFromClient;
    boolean isOrdered;

    public OrderedDto(OrderRequestFromClient orderRequestFromClient, boolean isOrdered) {
        this.orderRequestFromClient = orderRequestFromClient;
        this.isOrdered = isOrdered;
    }

    public OrderRequestFromClient getOrderRequestFromDelivery() {
        return orderRequestFromClient;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
