package Food2Door;

public class OrderRetiever {

    public Order retiever1() {
        Client client = new Client("Jan", "Nowak");
        Product product = new Product("Rzodkiew");
        int quantity = 9;
        return new Order(client, product, quantity);
    }

    public Order retiever2() {
        Client client = new Client("Maciek", "Kowalki");
        Product product = new Product("Miód");
        int quantity = 50;
        return new Order(client, product, quantity);
    }

    public Order retiever3() {
        Client client = new Client("Eugeniusz", "Ganiusz");
        Product product = new Product("Pomidor");
        int quantity = 15;
        return new Order(client, product, quantity);
    }
}
