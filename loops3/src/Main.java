import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int limit;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter limit number: ");
        limit = sc.nextInt();

        System.out.print("Powers of 4 to " + limit + ": ");
        for (int i = 1; i < limit; i *= 4) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("Powers of 5 to " + limit + ": ");
        for (int i = 1; i < limit; i *= 5) {
            System.out.print(i + " ");
        }
    }
}