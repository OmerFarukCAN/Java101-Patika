import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n;
        double result = 0.0;

        System.out.print("Please enter number of n: ");
        n = sc.nextDouble();

        for (double i = 1.0; i <= n; i++) {
            result += (1 / i);
        }
        System.out.println(result);
    }
}