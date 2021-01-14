package Flights;

import java.util.ArrayList;
import java.util.List;

public class FlightsAnalysis {

    private ListOfFlights listOfCties = new ListOfFlights();
//    private ListOfFlights listOfDeparturesCties = new ListOfFlights();
//    private ListOfFlights listOfArrivalCties = new ListOfFlights();

    public void findDeparturesCities(String departuresCities) {
        System.out.println("All flight from " + departuresCities + ": ");
        listOfCties.getFlightList().stream()
                .filter(flights -> flights.getDepartureAirport().equals(departuresCities))
                .forEach(p -> System.out.println("From: " + departuresCities + " to " + p.getArivallAiroport()));
    }

    public void findArrivalCiteis(String arrivalCities) {
        System.out.println("All flight to " + arrivalCities + ": ");
        listOfCties.getFlightList().stream()
                .filter(flights -> flights.getArivallAiroport().equals(arrivalCities))
                .forEach(p -> System.out.println("From: " + p.getDepartureAirport() + " to " + arrivalCities));
    }

    public void findIndirecltyFly(String departuresCities, String arrivalCities) {
        System.out.println("List of indirectly flights from: " + departuresCities + " to " + arrivalCities);
        List<Flights> theListIndirectlFlights = new ArrayList<>();
        listOfCties.getFlightList().stream()
                .filter(flights -> flights.getArivallAiroport().equals(arrivalCities))
                .forEach(s -> theListIndirectlFlights.add(s));

        listOfCties.getFlightList().stream()
                .filter(flights -> flights.getDepartureAirport().equals(departuresCities))
                .forEach(s -> theListIndirectlFlights.add(s));

        theListIndirectlFlights.stream()
                .filter(flights -> !flights.getDepartureAirport().equals(departuresCities))
                .forEach(flights -> System.out.println(departuresCities + " ---> " + flights.getDepartureAirport() + " ---> " + arrivalCities));
    }
}
