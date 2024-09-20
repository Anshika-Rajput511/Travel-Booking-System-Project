import java.util.ArrayList;
import java.util.List;

public class TravelService {
    private List<Trip> trips = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();

    public TravelService() {
        // Add some default trips
        trips.add(new Trip("Paris", "2024-10-15", 500));
        trips.add(new Trip("New York", "2024-11-01", 600));
    }

    public List<Trip> getAvailableTrips() {
        return trips;
    }

    public Booking bookTrip(User user, Trip trip) {
        Booking booking = new Booking(user, trip);
        bookings.add(booking);
        return booking;
    }
}

