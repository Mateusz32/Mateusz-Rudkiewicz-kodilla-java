package test;

import java.util.HashMap;
import java.util.Map;

public class FindFlights {

    public void findFilght(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> listOfFlights = new HashMap<>();
        listOfFlights.put("Warsaw", true);
        listOfFlights.put("Moscow", false);
        listOfFlights.put("London", true);
        listOfFlights.put("Paris", false);
        listOfFlights.put("Berlin", false);
        listOfFlights.put("Rome", true);
        listOfFlights.put("Tokyo", false);

        if (listOfFlights.containsKey(flight.getArrivalAirport())) {
            if (listOfFlights.containsValue(true)) {
                System.out.println("The airport " + flight.getArrivalAirport() + " is on.");
            } else {
                System.out.println("The airport " + flight.getArrivalAirport() + " is on.");
            }
        } else {
            throw new RouteNotFoundException("RouteNotFoundException");
        }
    }

    public static void main(String[] args) {
        Flight flight1 = new Flight("Paris", "Rome");
        Flight flight2 = new Flight("Berlin", "London");
        Flight flight3 = new Flight("Warsaw", "Moscow");
        Flight flight4 = new Flight("London", "Tokyo");
        Flight flight5 = new Flight("Rome", "Warsaw");
        Flight flight6 = new Flight("Moscow", "Berlin");
        Flight flight7 = new Flight("New York", "Paris");
        Flight flight8 = new Flight("Nysa", "New York");

        FindFlights findFlights = new FindFlights();
        try {
            findFlights.findFilght(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("Lack airport " + flight1.getArrivalAirport() + " in the list");
        }
        try {
            findFlights.findFilght(flight8);
        } catch (RouteNotFoundException e) {
            System.out.println("Lack airport " + flight8.getArrivalAirport() + " in the list.");
        }
    }
}


