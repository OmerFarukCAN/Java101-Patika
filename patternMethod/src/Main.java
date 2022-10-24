import java.util.Scanner;

public class Main {
    static void pattern(int number, int tempNumber, int n) {
        if (number > 0 && n == 0) {
            System.out.print(number + " ");
            number -= 5;
            pattern(number, tempNumber, 0);

        } else if (number <= 0) {
            System.out.print(number + " ");
            number += 5;
            pattern(number, tempNumber, 1);
        } else if (number <= tempNumber && n == 1) {
            System.out.print(number + " ");
            number += 5;
            pattern(number, tempNumber, 1);
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("N number: ");
        n = sc.nextInt();

        pattern(n, n, 0);
    }
}
