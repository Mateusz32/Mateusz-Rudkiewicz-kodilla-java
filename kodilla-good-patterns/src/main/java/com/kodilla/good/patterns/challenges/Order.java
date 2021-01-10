package com.kodilla.good.patterns.challenges;

public class Order implements OrderService{
    @Override
    public boolean order(OrderRequest orderRequest) {
        System.out.println("Set the order: "+orderRequest.getProduct().getNameOfProduct()+", "+orderRequest.getProduct().getQuantityOfProduct()+" pcs, "+orderRequest.getProduct().getPrice() +"PLN for: "+orderRequest.getUser().getName()+" "+orderRequest.getUser().getSurname());
        return true;
    }


}
