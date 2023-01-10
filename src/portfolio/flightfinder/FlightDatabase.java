package portfolio.flightfinder;

import java.util.ArrayList;

public class FlightDatabase {
    private final ArrayList<Flight> flights = new ArrayList<Flight>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void deleteFlight(Flight flight) {
        flights.remove(flight);
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public void checkIfExist(String start, String end) {
        for (Flight flight : flights) {
            if (start.equals(flight.getDeparture()) && end.equals(flight.getArrival())) {
                System.out.println("Flight exist");
                return;
            }
        }
        System.out.println("Flight don't exist");
    }

    public void getFlightFromCity(String start) {
        for (Flight flight : flights) {
            if (start.equals(flight.getDeparture())) {
                System.out.println(flight);
            }
        }
    }

    public void getFlightToCity(String end) {
        for (Flight flight : flights) {
            if (end.equals(flight.getArrival())) {
                System.out.println(flight);
            }
        }
    }

    @Override
    public String toString() {
        return "FlightDatabase{" +
                "flights=" + flights +
                '}';
    }
}

