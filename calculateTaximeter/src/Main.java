import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
        double finalAmount, amountToPay;
        int startAmount = 10;
        int minAmount = 20;
        double amountPerKm = 2.20;
        Scanner sc = new Scanner(System.in);

        System.out.print("Distance in km: ");
        km = sc.nextInt();

        finalAmount = startAmount + (km * amountPerKm);
        amountToPay = finalAmount > 20 ? finalAmount : minAmount;
        System.out.println("Amount to be paid: " + amountToPay);
    }
}