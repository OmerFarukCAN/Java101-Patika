import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r, combination;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter n -> C(n,r) : ");
        n = sc.nextInt();
        System.out.print("Please enter r -> C(n,r) : ");
        r = sc.nextInt();

        combination = factorial(n) / (factorial(r) * factorial(n - r));
        System.out.println("C(" + n + "," + r + ")" + " = " + combination);
    }

    public static int factorial(int number) {
        if (number == 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
