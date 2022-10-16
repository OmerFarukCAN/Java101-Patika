import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2;
        int result = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter floor number: ");
        n1 = sc.nextInt();
        System.out.print("Enter ceiling number: ");
        n2 = sc.nextInt();

        for (int i = 0; i < n2; i++) {
            result *= n1;
        }
        System.out.println(n1 + " to the " + n2 + "th power: " + result);
    }
}