import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1, number2;
        boolean a = false;

        do {
            System.out.print("Please enter number 1: ");
            number1 = sc.nextInt();
            System.out.print("Please enter number 2: ");
            number2 = sc.nextInt();
            if (number1 <= 0 || number2 <= 0) {
                System.out.println("Please enter positive number.");
            } else {
                a = true;
            }
        } while (!a);

        if (number2 < number1) {
            int tempNumber2 = number2;
            number2 = number1;
            number1 = tempNumber2;
        }

        int i = number1;

        while (i >= 1) {
            if ((number1 % i == 0) && (number2 % i == 0)) {
                System.out.println("Ebob: " + i);
                break;
            } else {
                i--;
            }
        }

        int j = number2;

        while (j <= (number1 * number2)) {
            if ((j % number1 == 0) && (j % number2 == 0)) {
                System.out.println("Ekok: " + j);
                break;
            } else {
                j++;
            }
        }
    }
}