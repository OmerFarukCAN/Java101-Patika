import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your birth of month: ");
        month = sc.nextInt();
        System.out.print("Please enter your birth of day: ");
        day = sc.nextInt();

        if ((month > 0 && month < 13) && (day > 0 && day < 32)) {
            if (month == 1 && day >= 22 || month == 2 && day <= 19) System.out.println("Aquarius");
            if (month == 2 && day >= 20 && day <= 28 || month == 3 && day <= 20) {
                System.out.println("Pisces");
            } else if (month == 2 && day > 28) System.out.println("Invalid day: " + day);
            if (month == 3 && day >= 21 || month == 4 && day <= 20) System.out.println("Aries");
            if (month == 4 && day >= 21 && day <= 30 || month == 5 && day <= 21) {
                System.out.println("Taurus");
            } else if (month == 4 && day > 30) System.out.println("Invalid day: " + day);
            if (month == 5 && day >= 22 || month == 6 && day <= 22) System.out.println("Gemini");
            if (month == 6 && day >= 23 && day <= 30 || month == 7 && day <= 22) {
                System.out.println("Cancer");
            } else if (month == 6 && day > 30) System.out.println("Invalid day: " + day);
            if (month == 7 && day >= 23 || month == 8 && day <= 22) System.out.println("Leo");
            if (month == 8 && day >= 23 || month == 9 && day <= 22) System.out.println("Virgo");
            if (month == 9 && day >= 23 && day <= 30 || month == 10 && day <= 22) {
                System.out.println("Libra");
            } else if (month == 9 && day > 30) System.out.println("Invalid day: " + day);
            if (month == 10 && day >= 23 || month == 11 && day <= 21) System.out.println("Scorpio");
            if (month == 11 && day >= 22 && day <= 30 || month == 12 && day <= 21) {
                System.out.println("Sagittarius");
            } else if (month == 11 && day > 30) System.out.println("Invalid day: " + day);
            if (month == 12 && day >= 23 || month == 1 && day <= 21) System.out.println("Capricorn");
        } else {
            System.out.println("Invalid month or date");
        }
    }
}