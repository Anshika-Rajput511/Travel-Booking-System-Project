public class Booking {
    private User user;
    private Trip trip;

    public Booking(User user, Trip trip) {
        this.user = user;
        this.trip = trip;
    }

    @Override
    public String toString() {
        return "Booking for " + user.getName() + " - " + trip.toString();
    }
}

