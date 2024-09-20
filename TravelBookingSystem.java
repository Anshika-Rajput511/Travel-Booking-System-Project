import java.util.List;
import java.util.Scanner;

public class TravelBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TravelService travelService = new TravelService();

        System.out.println("Welcome to the Travel Booking System!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        User user = new User(name, email);

        System.out.println("\nAvailable Trips:");
        List<Trip> trips = travelService.getAvailableTrips();
        for (int i = 0; i < trips.size(); i++) {
            System.out.println((i + 1) + ". " + trips.get(i));
        }

        System.out.print("\nSelect a trip by number: ");
        int tripNumber = scanner.nextInt() - 1;

        if (tripNumber >= 0 && tripNumber < trips.size()) {
            Booking booking = travelService.bookTrip(user, trips.get(tripNumber));
            System.out.println("\n" + booking);
        } else {
            System.out.println("Invalid selection.");
        }
        scanner.close();
    }
}
