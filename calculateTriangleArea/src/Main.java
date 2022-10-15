import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First side of triangle: ");
        int side1 = sc.nextInt();
        System.out.print("Second side of triangle: ");
        int side2 = sc.nextInt();
        System.out.print("Third side of triangle: ");
        int side3 = sc.nextInt();

        int perimeterTriangle = side1 + side2 + side3;
        int u = perimeterTriangle / 2;

        double area = Math.sqrt((u * (u - side1) * (u - side2) * (u - side3)));
        System.out.println("Area of triangle: " + area);
    }
}