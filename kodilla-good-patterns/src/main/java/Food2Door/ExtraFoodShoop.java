package Food2Door;

public class ExtraFoodShoop implements DeliveryService {
    @Override
    public boolean process(OrderRequestFromClient orderRequest) {
        System.out.println("Send order to Food2Door, discount 30%");
        return true;
    }
}
