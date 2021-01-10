package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest);
        if (isOrdered) {
            informationService.sendMessage(orderRequest.getUser());
            orderRepository.createOrder(orderRequest);
            return new OrderDto(orderRequest.getUser(), true);
        } else return new OrderDto(orderRequest.getUser(), false);
    }
}
