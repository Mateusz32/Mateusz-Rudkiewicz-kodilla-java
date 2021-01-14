package Food2Door;

public class Applications {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequestFromClient orderRequestFromClient = orderRequestRetriever.retriver1();
        OrderImplementation orderImplementation = new OrderImplementation(new Mail(), new DHL(), new ExtraFoodShoop());
        orderImplementation.process(orderRequestFromClient);
    }


}
