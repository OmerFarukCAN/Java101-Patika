import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int temperature;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter temperature: ");
        temperature = sc.nextInt();

        if (temperature < 5) System.out.println("You can ski.");
        else if (temperature <= 15) System.out.println("You can go to the cinema");
        else if (temperature <= 25) System.out.println("You can go on a picnic");
        else System.out.println("You can go swimming");
    }
}