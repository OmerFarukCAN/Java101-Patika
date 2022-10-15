import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double radius, centerAngle, area;
        double pi = Math.PI;
        Scanner sc = new Scanner(System.in);

        System.out.print("Radius of circle: ");
        radius = sc.nextDouble();
        System.out.print("Center angle of circle: ");
        centerAngle = sc.nextDouble();

        area = (pi * (radius * radius) * centerAngle) / 360;
        System.out.println("Area of the circle segment: " + area);
    }
}