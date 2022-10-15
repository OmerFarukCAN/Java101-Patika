import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double height, weight, bodyMassIndex;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your height in meters: ");
        height = sc.nextDouble();
        System.out.print("Please enter your weight in kg: ");
        weight = sc.nextDouble();

        bodyMassIndex = (weight / (height * height));
        System.out.println("Your body mass index: " + bodyMassIndex);
    }
}