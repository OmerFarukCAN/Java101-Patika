import java.util.Scanner;

public class Main {
    static void isPrimeNumber(int number, int k) {
        if (number == k) {
            System.out.println(number + " is a prime number");
            return;
        } else if (number % k == 0) {
            System.out.println(number + " is not a prime number");
            return;
        }
        isPrimeNumber(number, k + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Please enter a number: ");
        number = sc.nextInt();

        isPrimeNumber(number, 2);
    }
}