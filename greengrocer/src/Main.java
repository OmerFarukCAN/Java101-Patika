import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pearPerKg = 2.14;
        double applePerKg = 3.67;
        double tomatoPerKg = 1.11;
        double bananaPerKg = 0.95;
        double auberginePerKg = 5;
        double pearKg, appleKg, tomatoKg, bananaKg, aubergineKg, totalAmount;
        Scanner sc = new Scanner(System.in);

        System.out.print("Pear(kg): ");
        pearKg = sc.nextDouble();
        System.out.print("Apple(kg): ");
        appleKg = sc.nextDouble();
        System.out.print("Tomato(kg): ");
        tomatoKg = sc.nextDouble();
        System.out.print("Banana(kg): ");
        bananaKg = sc.nextDouble();
        System.out.print("Aubergine(kg): ");
        aubergineKg = sc.nextDouble();

        totalAmount = (pearPerKg * pearKg) + (applePerKg * appleKg) + (tomatoPerKg * tomatoKg) +
                (bananaPerKg * bananaKg) + (auberginePerKg * aubergineKg);

        System.out.println("Total Amount: " + totalAmount);
    }
}