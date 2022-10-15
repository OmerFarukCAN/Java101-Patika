import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, changePassword, newPassword;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your username: ");
        userName = sc.nextLine();
        System.out.print("Please enter your password: ");
        password = sc.nextLine();

        if (userName.equals("username") && password.equals("password123")) {
            System.out.println("Login success.");
        } else {
            System.out.print("Your username or password is wrong! Could you want reset your password?(y/n): ");
            changePassword = sc.nextLine();
            switch (changePassword) {
                case "y" -> {
                    System.out.print("Please enter your new password: ");
                    newPassword = sc.nextLine();
                    if (!(newPassword.equals(password)) && !(newPassword.equals("password123"))) {
                        System.out.println("Password created.");
                    } else {
                        System.out.println("Could not create password, please enter another password.");
                    }
                }
                case "n" -> System.out.println("Login Failed.");
                default -> System.out.println("Invalid input");
            }
        }
    }
}