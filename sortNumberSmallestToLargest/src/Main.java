import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2;
        int maxNumber;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        n2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        maxNumber = sc.nextInt();

        if (n2 > maxNumber) maxNumber = n2;
        if (n1 > maxNumber) maxNumber = n1;
        System.out.println("Max number: " + maxNumber);
    }
}