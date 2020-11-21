package world;

import java.math.BigDecimal;

public class Country {

    private final String nameCountry;
    private final BigDecimal peopleQuantity;

    public Country(final String nameCountry, final BigDecimal peopleQuantity) {
        this.nameCountry = nameCountry;
        this.peopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}
