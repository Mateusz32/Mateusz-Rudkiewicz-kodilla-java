package Food2Door;

public class OrderRequestFromDelivery {

    private Client client;
    private Product product;

    public OrderRequestFromDelivery(Client client, Product product) {
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
