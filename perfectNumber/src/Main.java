import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int result = 0;

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                result += i;
            }
        }
        if (result == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}