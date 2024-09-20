public class Trip {
    private String destination;
    private String date;
    private double price;

    public Trip(String destination, String date, double price) {
        this.destination = destination;
        this.date = date;
        this.price = price;
    }

    // Getters
    public String getDestination() {
        return destination;
    }

    public String getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Trip to " + destination + " on " + date + " costs $" + price;
    }
}

