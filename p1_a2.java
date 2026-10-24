import java.util.Scanner;

class TollBooth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalToll = 0;
        int bikeCount = 0;
        int carCount = 0;
        int truckCount = 0;

        while (true) {
            System.out.print("Enter Vehicle Number (or 'done' to stop): ");
            String number = sc.next();

            if (number.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Enter Vehicle Type (bike/car/truck): ");
            String type = sc.next().toLowerCase();

            Vehicle vehicle = new Vehicle(number, type);

            int toll = 0;
            switch (vehicle.type()) {
                case "bike":
                    bikeCount++;
                    toll = 20;
                    break;
                case "car":
                    carCount++;
                    toll = 50;
                    break;
                case "truck":
                    truckCount++;
                    toll = 150;
                    break;
                default:
                    System.out.println("Invalid Vehicle");
                    toll = 0;
            }

            totalToll += toll;
        }

        System.out.println("Toll Data");
        System.out.println("Total Toll: " + totalToll);

        String mostFrequent = "No valid vehicle";
        int highestCount = 0;

        if (bikeCount > highestCount) {
            highestCount = bikeCount;
            mostFrequent = "bike";
        }

        if (carCount > highestCount) {
            highestCount = carCount;
            mostFrequent = "car";
        }

        if (truckCount > highestCount) {
            highestCount = truckCount;
            mostFrequent = "truck";
        }

        System.out.println("Most Frequent: " + mostFrequent);

        sc.close();
    }
}

record Vehicle(String number, String type) {}