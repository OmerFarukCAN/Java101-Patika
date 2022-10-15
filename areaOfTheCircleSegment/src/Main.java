import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Radius of circle: ");
        double radius = sc.nextDouble();
        System.out.print("Center angle of circle: ");
        double centerAngle = sc.nextDouble();
        double pi = Math.PI;
        System.out.println(pi);

        double area = (pi * (radius * radius) * centerAngle) / 360;
        System.out.println("Area of the circle segment: " + area);
    }
}