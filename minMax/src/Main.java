import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberCounter, minNumber, maxNumber;

        System.out.print("How many numbers will you enter: ");
        numberCounter = sc.nextInt();

        int[] numbers = new int[numberCounter];

        for (int i = 1; i <= numberCounter; i++) {
            System.out.print("Enter number " + i + ": ");
            numbers[i - 1] = sc.nextInt();
        }

        maxNumber = numbers[0];
        minNumber = numbers[0];
        for (int num : numbers) {
            if (num > maxNumber) {
                maxNumber = num;
            }
            if (num < minNumber) {
                minNumber = num;
            }
        }
        System.out.println("Max number: " + maxNumber);
        System.out.println("Min number: " + minNumber);
    }
}