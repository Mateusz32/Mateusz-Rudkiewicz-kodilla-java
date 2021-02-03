package Food2Door;

public class Mail implements Informationervice {
    @Override
    public void sendInformation(Order order) {
        System.out.println("Wyślij informacje na pocztę elektorniczna do: "
                + order.getClient().getName() + " " + order.getClient().getSurname());
    }
}
