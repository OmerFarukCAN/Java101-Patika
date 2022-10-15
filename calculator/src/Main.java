import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2;
        int selectedNumber;
        int count = 4;
        Scanner sc = new Scanner(System.in);

        while (count > 0) {
            System.out.print("Please enter the first number: ");
            n1 = sc.nextDouble();
            System.out.print("Please enter the second number: ");
            n2 = sc.nextDouble();

            System.out.println("1-Addition\n2-Subtraction\n3-Divide\n4-Multiply");
            System.out.print("Please select the action you want to do: ");
            selectedNumber = sc.nextInt();

            switch (selectedNumber) {
                case 1:
                    System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                    break;
                case 2:
                    System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                    break;
                case 3:
                    switch ((int) n2) {
                        case 0 -> System.out.println("Dividing a number by zero is undefined.");
                        default -> System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                    }
                    break;
                case 4:
                    System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
                    break;
                default:
                    System.out.println("Please enter valid number.");
                    break;
            }
            count--;
        }
    }
}