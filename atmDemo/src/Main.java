import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, passWord;
        int select, price;
        int right = 3, balance = 5000;

        Scanner sc = new Scanner(System.in);

        while (right > 0) {
            System.out.print("Please enter username: ");
            userName = sc.nextLine();
            System.out.print("Please enter password: ");
            passWord = sc.nextLine();
            if (userName.equals("admin") && passWord.equals("admin123")) {
                System.out.println("Hello. Welcome to Kodluyoruz Bank.");
                do {
                    System.out.println("""
                            1 - Deposit
                            2 - Withdraw
                            3 - Check Balance
                            4 - EXIT""");
                    System.out.print("Please select the action you want to do: ");
                    select = sc.nextInt();
                    switch (select) {
                        case 1 -> {
                            System.out.print("The amount of money you want to deposit: ");
                            price = sc.nextInt();
                            balance += price;
                        }
                        case 2 -> {
                            System.out.print("The amount of money you want to withdraw: ");
                            price = sc.nextInt();
                            if (price > balance) {
                                System.out.println("Insufficient balance.");
                            } else {
                                balance -= price;
                            }
                        }
                        case 3 -> System.out.println("Your balance : " + balance);
                        default -> System.out.println("You entered an invalid value.");
                    }
                } while (select != 4);
                System.out.println("See you again.");
            } else {
                right--;
                System.out.println("Invalid user or password. Try again.");
                if (right == 0) {
                    System.out.println("Your account has been blocked. Please contact the bank.");
                } else {
                    System.out.println("Your remaining right : " + right);
                }
            }
        }
    }
}