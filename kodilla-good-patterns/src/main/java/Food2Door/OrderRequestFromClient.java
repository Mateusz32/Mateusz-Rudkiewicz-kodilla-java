package Food2Door;

public class OrderRequestFromClient {

    private Client client;
    private Product product;

    public OrderRequestFromClient(Client client, Product product) {
        this.client = client;
        this.product = product;
    }

    public Client getClient() {
        return client;
    }

    public Product getProduct() {
        return product;
    }
}
