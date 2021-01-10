package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){
        User user = new User("Jan", "Kowalski");
        Product product = new Product("Game", 2,100.50);

        return new OrderRequest(user,product);
    }




}
