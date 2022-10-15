import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int side1, side2, side3, perimeterTriangle, u;
        double area;
        Scanner sc = new Scanner(System.in);

        System.out.print("First side of triangle: ");
        side1 = sc.nextInt();
        System.out.print("Second side of triangle: ");
        side2 = sc.nextInt();
        System.out.print("Third side of triangle: ");
        side3 = sc.nextInt();

        perimeterTriangle = side1 + side2 + side3;
        u = perimeterTriangle / 2;

        area = Math.sqrt((u * (u - side1) * (u - side2) * (u - side3)));
        System.out.println("Area of triangle: " + area);
    }
}