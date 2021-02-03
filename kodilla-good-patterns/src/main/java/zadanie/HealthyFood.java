package zadanie;

import java.util.HashMap;

public class HealthyFood implements Service {

    public HashMap<String, Integer> getStorageOfHealthyFood() {
        HashMap<String, Integer> listAndQuantityOfProduct = new HashMap<>();
        listAndQuantityOfProduct.put("Pomidor", 20);
        listAndQuantityOfProduct.put("Marchewka", 10);
        listAndQuantityOfProduct.put("Rzodkiew", 15);
        listAndQuantityOfProduct.put("Papryka", 18);
        listAndQuantityOfProduct.put("Miód", 13);
        return listAndQuantityOfProduct;
    }

    @Override
    public boolean process(Order order) {

        if (getStorageOfHealthyFood().containsKey(order.getProduct().getName())
                && order.getQuantity() <= getStorageOfHealthyFood().get(order.getProduct().getName())) {
            System.out.println(order.getQuantity()+ " kg "+order.getProduct().getName()+" znajduje się w magazynie HealthyFood. Zamówienie możliwe do wykonania.");
            return true;
        } else System.out.println(order.getQuantity()+ " kg "+order.getProduct().getName()+" Brak towaru w magazynie HealthyFood.");
        return false;
    }
}
