package Food2Door;

public class HealthyFood implements DeliveryService {
    @Override
    public boolean process(OrderRequestFromClient orderRequest) {
        System.out.println("Send order to Food2Door");
        return true;
    }
}
