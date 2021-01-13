package Flights;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListOfFlights {

    public List<Flights> getFlightList() {
        List<Flights> flightsList = new ArrayList<>();
        flightsList.add(new Flights("Warsaw", "Berlin"));
        flightsList.add(new Flights("Paris", "Berlin"));
        flightsList.add(new Flights("Paris", "Berlin"));
        flightsList.add(new Flights("London", "Berlin"));
        flightsList.add(new Flights("Warsaw", "London"));
        flightsList.add(new Flights("Warsaw", "Paris"));
        flightsList.add(new Flights("Madryt", "Moscow"));
        flightsList.add(new Flights("Madryt", "Rome"));
        flightsList.add(new Flights("Rome", "Moscow"));
        return flightsList;
    }
}
