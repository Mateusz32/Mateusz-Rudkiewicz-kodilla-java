package Food2Door;

public class DHL implements CourierService{

    @Override
    public void sendOrder(OrderRequestFromClient orderRequest) {
        System.out.println("Send order to: "+orderRequest.getClient().getName()+" "+orderRequest.getClient().getSurname());
    }
}
