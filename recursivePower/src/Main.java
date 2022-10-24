import java.util.Scanner;

public class Main {
    static int result = 1;

    static int power(int n1, int n2) {
        if (n2 == 0) {
            return 1;
        }
        result *= n1;
        power(n1, n2 - 1);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baseNumber, exponentialNumber, result;

        System.out.print("Please enter base number: ");
        baseNumber = input.nextInt();
        System.out.print("Please enter the exponential number: ");
        exponentialNumber = input.nextInt();

        result = power(baseNumber, exponentialNumber);
        System.out.println(result);
    }
}