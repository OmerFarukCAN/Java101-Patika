import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int total = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter number: ");
        number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 && i % 4 == 0) total += i;
        }
        System.out.println("Total: " + total);
    }
}