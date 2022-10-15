import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 4;
        while (count > 0) {
            System.out.print("Please enter the first number: ");
            double n1 = sc.nextDouble();
            System.out.print("Please enter the second number: ");
            double n2 = sc.nextDouble();

            System.out.println("1-Addition\n2-Subtraction\n3-Divide\n4-Multiply");
            System.out.print("Please select the action you want to do: ");
            int selectedNumber = sc.nextInt();

            switch (selectedNumber) {
                case 1 -> System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                case 2 -> System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                case 3 -> System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                case 4 -> System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
                default -> System.out.println("Please enter valid number.");
            }
            count--;
        }
    }
}