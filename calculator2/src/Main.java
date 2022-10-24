import java.util.Scanner;

public class Main {
    static void plus() {
        Scanner sc = new Scanner(System.in);
        int number, result = 0, i = 1;

        while (true) {
            System.out.print("Number " + i++ + " : ");
            number = sc.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Result: " + result);
    }

    static void minus() {
        Scanner sc = new Scanner(System.in);
        int counter;
        int number, result = 0;

        System.out.print("How many numbers will you enter: ");
        counter = sc.nextInt();

        for (int i = 1; i <= counter; i++) {
            System.out.print("Number " + i + " : ");
            number = sc.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Result: " + result);
    }

    static void times() {
        Scanner sc = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print("Number " + i++ + " : ");
            number = sc.nextInt();

            if (number == 1) break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Result: " + result);
    }

    static void divided() {
        Scanner sc = new Scanner(System.in);
        double number, result = 0.0;
        int counter;

        System.out.print("How many numbers will you enter: ");
        counter = sc.nextInt();

        for (int i = 1; i <= counter; i++) {
            System.out.print("Number " + i + " : ");
            number = sc.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("You cannot enter the divisor 0.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Result: " + result);
    }

    static void power() {
        Scanner sc = new Scanner(System.in);
        int base, exponent;
        int result = 1;

        System.out.print("Enter the base value: ");
        base = sc.nextInt();

        System.out.print("Enter the exponent value: ");

        exponent = sc.nextInt();

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println("Result: " + result);
    }

    static void factorial() {
        Scanner sc = new Scanner(System.in);
        int n;
        int result = 1;

        System.out.print("Please enter a number: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Result: " + result);
    }

    static void mod() {
        Scanner sc = new Scanner(System.in);
        int number1, number2, result;

        System.out.print("Please enter first number: ");
        number1 = sc.nextInt();
        System.out.print("Please enter second number: ");
        number2 = sc.nextInt();

        result = number1 % number2;
        System.out.println("Result: " + result);
    }

    static void rectangularAreaPerimeter() {
        Scanner sc = new Scanner(System.in);
        int edge1, edge2, area, perimeter;

        System.out.print("Please enter edge 1: ");
        edge1 = sc.nextInt();
        System.out.print("Please enter edge 2: ");
        edge2 = sc.nextInt();

        area = edge1 * edge2;
        perimeter = 2 * (edge1 + edge2);
        System.out.println("Area: " + area + " / Perimeter: " + perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select;
        String menu = """
                1- Addition
                2- Subtraction
                3- Multiplication
                4- Division
                5- Calculating exponential numbers
                6- Factorial calculation
                7- Mod
                8- Rectangular area and perimeter calculation
                0- Exit""";

        do {
            System.out.println(menu);
            System.out.print("Please select an action: ");
            select = sc.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangularAreaPerimeter();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid value. Please try again.");
            }
        } while (select != 0);
    }
}