import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startAmount = 10;
        int minAmount = 20;
        double amountPerKm = 2.20;

        System.out.print("Distance in km: ");
        int km = sc.nextInt();

        double finalAmount = startAmount + (km * amountPerKm);
        double amountToPay = finalAmount > 20 ? finalAmount : minAmount;
        System.out.println("Amount to be paid: " + amountToPay);
    }
}