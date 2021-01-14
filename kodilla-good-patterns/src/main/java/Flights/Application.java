package Flights;

public class Application {

    public static void main(String[] args) {
        FlightsAnalysis flightsAnalysis = new FlightsAnalysis();

        flightsAnalysis.findDeparturesCities("Madryt");
        flightsAnalysis.findArrivalCiteis("Moscow");
        flightsAnalysis.findIndirecltyFly("Warsaw","Berlin");
    }

}
