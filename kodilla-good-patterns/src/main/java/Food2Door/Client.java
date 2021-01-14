package Food2Door;

public class Client {

    private String name;
    private String surname;
    private String adressMail;

    public Client(String name, String surname, String adressMail) {
        this.name = name;
        this.surname = surname;
        this.adressMail = adressMail;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAdressMail() {
        return adressMail;
    }
}
