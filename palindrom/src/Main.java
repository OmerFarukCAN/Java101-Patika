import java.util.Scanner;

public class Main {
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber) {
            System.out.println(number + " is a palindrom number.");
            return true;
        } else {
            System.out.println(number + " is not a palindrom number.");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Please enter a number: ");
        n = sc.nextInt();

        System.out.println(isPalindrom(n));
    }
}