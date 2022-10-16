import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, age, tripType;
        double totalAmount, totalAmountUnder_12, totalAmountOver_65, totalAmountBetween_12_24;
        double pricePerKm = 0.10;
        double roundTrip = 0.2;
        double under_12 = 0.5;
        double between_12_24 = 0.1;
        double over_65 = 0.3;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance in km: ");
        km = sc.nextInt();
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        System.out.print("Enter your trip type(1 => One Way, 2 => Round Trip): ");
        tripType = sc.nextInt();

        totalAmount = km * pricePerKm * tripType;
        totalAmountUnder_12 = totalAmount - (totalAmount * under_12);
        totalAmountBetween_12_24 = totalAmount - (totalAmount * between_12_24);
        totalAmountOver_65 = totalAmount - (totalAmount * over_65);

        if (km > 0 && age > 0 && (tripType == 1 || tripType == 2)) {
            if (age < 12 && tripType == 1) {
                totalAmount = totalAmountUnder_12;
            } else if (age < 12) {
                totalAmount = totalAmountUnder_12;
                totalAmount -= totalAmountUnder_12 * roundTrip;
            } else if (age < 24 && tripType == 1) {
                totalAmount -= totalAmount * between_12_24;
            } else if (age < 24) {
                totalAmount = totalAmountBetween_12_24;
                totalAmount -= totalAmountBetween_12_24 * roundTrip;
            } else if (age > 65 && tripType == 1) {
                totalAmount = totalAmountOver_65;
            } else if (age > 65) {
                totalAmount = totalAmountOver_65;
                totalAmount -= totalAmountOver_65 * roundTrip;
            } else if (tripType == 2) totalAmount -= totalAmount * roundTrip;
            System.out.println("Total Amount: " + totalAmount);
        } else {
            System.out.println("Invalid Input");
        }
    }
}