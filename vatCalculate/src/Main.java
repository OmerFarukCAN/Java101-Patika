import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int vat = 0;
        Scanner sc = new Scanner(System.in);
        int priceWithoutVat = sc.nextInt();

        if (priceWithoutVat > 0 && priceWithoutVat <= 1000) {
            vat = 18;
        } else if (priceWithoutVat > 1000) {
            vat = 8;
        } else {
            System.out.println("Please enter a number greater than zero.");
        }
        double priceWithVat = priceWithoutVat + ((double) (priceWithoutVat * vat) / 100);
        System.out.println("Price with vat: " + priceWithVat);
    }
}