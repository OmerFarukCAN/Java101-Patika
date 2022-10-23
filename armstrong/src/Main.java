import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int a = sc.nextInt();
        int tempA = a;
        int digitCounter = 0;
        int sumOfDigits = 0;

        // find the number of digits
        while (tempA != 0) {
            tempA = tempA / 10;
            digitCounter++;
        }

        // Create an array of digits long.
        int[] digits = new int[digitCounter];

        // Adding the digits to each element of the array in turn.
        for (int i = 0; i < digitCounter; i++) {
            digits[i] = a % 10;
            a = a / 10;
        }

        // Summing up each element of the array sequentially.
        for (int digit : digits) {
            sumOfDigits += digit;
        }
        System.out.println("The sum of the digits of the entered number: " + sumOfDigits);
    }
}