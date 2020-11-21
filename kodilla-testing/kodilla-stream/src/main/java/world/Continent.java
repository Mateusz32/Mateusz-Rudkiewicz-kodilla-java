package world;

import java.util.List;

public final class Continent {

    private final List<Country> listOfCountries;

    public Continent(final List<Country> listOfCountries) {
        this.listOfCountries = listOfCountries;
    }

    public List<Country> getListOfCountries() {
        return listOfCountries;
    }


}
