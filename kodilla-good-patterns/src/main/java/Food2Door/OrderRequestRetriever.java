package Food2Door;

public class OrderRequestRetriever {

    public OrderRequestFromClient retriver1() {
        Client client = new Client("Jan", "Nowak", "jan@nowak.com.pl");
        Product product = new Product("Health breakfast", 5, 149.99);
        return new OrderRequestFromClient(client, product);
    }

    public OrderRequestFromClient retriver2() {
        Client client = new Client("Piotr", "Kowalski", "piotr@kowalski.com.pl");
        Product product = new Product("Smooth diner", 2, 99.99);
        return new OrderRequestFromClient(client, product);
    }

    public OrderRequestFromClient retriver3() {
        Client client = new Client("Beata", "Cieplak", "beti@ciplak.com.pl");
        Product product = new Product("Water paradise", 1, 59.99);
        return new OrderRequestFromClient(client, product);
    }
}

