import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter number: ");
        number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 && i % 4 == 0) sum += i;
        }
        System.out.println("The sum of numbers divisible by 3 and 4: " + sum);
    }
}