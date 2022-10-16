import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int total = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        number = sc.nextInt();

        while (number % 2 == 0) {
            System.out.print("Please enter a number: ");
            number = sc.nextInt();
            if (number % 4 == 0) total += number;
        }
        System.out.println("Total: " + total);
    }
}