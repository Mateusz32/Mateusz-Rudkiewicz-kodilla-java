package Flights;

public class Application {

    public static void main(String[] args) {
        FlightsAnalysis findDepartureCities = new FlightsAnalysis();
        FlightsAnalysis findArrivalCities = new FlightsAnalysis();
        FlightsAnalysis findFlightsWithTransition = new FlightsAnalysis();

        findDepartureCities.findDeparturesCities("Madryt");
        findArrivalCities.findArrivalCiteis("Moscow");
        findFlightsWithTransition.findIndirecltyFly("Warsaw","Berlin");
    }

}
