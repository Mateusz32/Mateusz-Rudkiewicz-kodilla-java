package com.kodilla.good.patterns.challenges;

public class Repository implements OrderRepository{
    @Override
    public void createOrder(OrderRequest orderRequest) {
        System.out.println("Record order: "+orderRequest.getProduct().getNameOfProduct()+", "+orderRequest.getProduct().getQuantityOfProduct()+" pcs, "+orderRequest.getProduct().getPrice() +"PLN for: "+orderRequest.getUser()+" "+orderRequest.getUser().getSurname());
    }
}
