import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pearPerKg = 2.14;
        double applePerKg = 3.67;
        double tomatoPerKg = 1.11;
        double bananaPerKg = 0.95;
        double auberginePerKg = 5;

        System.out.print("Pear(kg): ");
        double pearKg = sc.nextDouble();
        System.out.print("Apple(kg): ");
        double appleKg = sc.nextDouble();
        System.out.print("Tomato(kg): ");
        double tomatoKg = sc.nextDouble();
        System.out.print("Banana(kg): ");
        double bananaKg = sc.nextDouble();
        System.out.print("Aubergine(kg): ");
        double aubergineKg = sc.nextDouble();

        double totalAmount = (pearPerKg * pearKg) + (applePerKg * appleKg) + (tomatoPerKg * tomatoKg) +
                (bananaPerKg * bananaKg) + (auberginePerKg * aubergineKg);

        System.out.println("Total Amount: " + totalAmount);
    }
}