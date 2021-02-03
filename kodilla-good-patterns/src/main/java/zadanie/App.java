package zadanie;

public class App {

    public static void main(String[] args) {
        OrderRetiever orderRetiever = new OrderRetiever();

        Order order1 = orderRetiever.retiever1();
        OrderImplementation orderImplementation1 = new OrderImplementation(new ExtraFoodShop(), new Mail());
        orderImplementation1.executed(order1);

        Order order2 = orderRetiever.retiever2();
        OrderImplementation orderImplementation2 = new OrderImplementation(new GlutenFreeShop(), new Mail());
        orderImplementation2.executed(order2);

        Order order3 = orderRetiever.retiever3();
        OrderImplementation orderImplementation3 = new OrderImplementation(new HealthyFood(), new Mail());
        orderImplementation3.executed(order3);
    }
}
