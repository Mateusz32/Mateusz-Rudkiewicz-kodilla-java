package Food2Door;

public class GlutenFreeShop implements DeliveryService {
    @Override
    public boolean process(OrderRequestFromClient orderRequest) {
        System.out.println("Send order to Food2Door, free botle of water extra");
        return true;
    }
}
