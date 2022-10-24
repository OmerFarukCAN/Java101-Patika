import java.util.Scanner;

public class Main {
    static int result = 1;

    static int power(int n1, int n2) {
        if (n1 == 0) {
            return 1;
        }
        result *= n2;
        power(n1 - 1, n2);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baseNumber, exponentialNumber;

        System.out.println("Please enter base number: ");
        baseNumber = input.nextInt();
        System.out.println("Please enter the exponential number: ");
        exponentialNumber = input.nextInt();

        System.out.println(power(baseNumber, exponentialNumber));
    }
}