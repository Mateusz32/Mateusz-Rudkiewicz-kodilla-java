package Flights;

import java.util.Objects;

public class Flights {
    private String departureAirport;
    private String arrivalAiroport;

    public Flights(String departureAirport, String arivallAiroport) {
        this.departureAirport = departureAirport;
        this.arrivalAiroport = arivallAiroport;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "departureAirport='" + departureAirport + '\'' +
                ", arivallAiroport='" + arrivalAiroport + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flights flights = (Flights) o;
        return Objects.equals(departureAirport, flights.departureAirport) &&
                Objects.equals(arrivalAiroport, flights.arrivalAiroport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureAirport, arrivalAiroport);
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArivallAiroport() {
        return arrivalAiroport;
    }
}
