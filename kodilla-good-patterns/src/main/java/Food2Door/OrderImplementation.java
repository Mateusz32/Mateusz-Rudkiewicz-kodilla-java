package Food2Door;

public class OrderImplementation {
    private Service service;
    private Informationervice informationervice;

    public OrderImplementation(Service service, Informationervice informationervice) {
        this.service = service;
        this.informationervice = informationervice;
    }

    public OrderDto executed(Order order) {
        boolean isOrdered = service.process(order);
        if (isOrdered) {
            System.out.println("Zlecenie gotowe do realizacji");
            informationervice.sendInformation(order);
            return new OrderDto(order, true);
        } else
            System.out.println("Zlecenie niemożliwe do realizacji");
        return new OrderDto(order, false);
    }


}
