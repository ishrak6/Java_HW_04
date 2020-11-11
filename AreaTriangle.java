
import java.util.Scanner;

class AreaTriangle {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st arm size:");
        double x1 = scanner.nextDouble();

        System.out.println("Enter 2n arm size:");
        double x2 = scanner.nextDouble();

        System.out.println("Enter 3rd arm size:");
        double x3 = scanner.nextDouble();

        double area = x1 + x2 + x3;
        System.out.println("Area of Triangle is: " + area);
    }
}