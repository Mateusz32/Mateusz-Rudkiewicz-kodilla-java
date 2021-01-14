package Food2Door;

public class OrderImplementation {

    private InformationService informationService;
    private CourierService courierService;
    private DeliveryService deliveryService;

    public OrderImplementation(InformationService informationService, CourierService courierService, DeliveryService deliveryService) {
        this.informationService = informationService;
        this.courierService = courierService;
        this.deliveryService = deliveryService;
    }

    public OrderedDto process(OrderRequestFromClient orderRequestFromClient) {
        boolean isOrdered = deliveryService.process(orderRequestFromClient);
        if (isOrdered) {
            informationService.sendInformation(orderRequestFromClient);
            courierService.sendOrder(orderRequestFromClient);
            return new OrderedDto(orderRequestFromClient, true);
        } else return new OrderedDto(orderRequestFromClient, false);
    }


}
