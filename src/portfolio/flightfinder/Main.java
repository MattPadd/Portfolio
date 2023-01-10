package portfolio.flightfinder;

public class Main {
    public static void main(String[] args) {
        FlightDatabase flightDatabase = new FlightDatabase();

        String[] departure = {"Warsaw", "London", "Paris", "Vienna", "Tokyo", "Las Vegas", "Madrid", "Milano"};
        String[] arrival = {"Warsaw", "London", "Paris", "Vienna", "Tokyo", "Las Vegas", "Madrid", "Milano"};

        for (String DEPARTURE : departure) {
            for (String ARRIVAL : arrival) {
                flightDatabase.addFlight(new Flight(DEPARTURE, ARRIVAL));
                if (DEPARTURE.equals(ARRIVAL)) {
                    flightDatabase.deleteFlight(new Flight(DEPARTURE, ARRIVAL));

                }
            }
        }
        System.out.println(flightDatabase.getFlights());
        flightDatabase.getFlightFromCity("Warsaw");
        flightDatabase.getFlightToCity("Vienna");
        flightDatabase.checkIfExist("Milano", "Paris");
    }
}