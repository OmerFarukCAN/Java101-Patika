import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter year: ");
        year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a bissextile year");
                } else System.out.println(year + " is not a bissextile year");
            } else System.out.println(year + " is a bissextile year");
        } else System.out.println(year + " is not a bissextile year");
    }
}