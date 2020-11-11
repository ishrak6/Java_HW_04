
import java.util.*;

public class Overloaded {

    double area(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double ar = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return ar;
    }

    double area(int a, int b, int height) {
        double ar = 1 / 2 * height * (a + b);
        return ar;
    }

    double area(double diagonal1, double diagonal2) {
        double ar = 1 / 2 * (diagonal1 * diagonal2);
        return ar;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Overloaded ob = new Overloaded();
        System.out.println("Area of Triangle =" + ob.area(6.4, 5.2, 8.3));
        System.out.println("Area of Trapezium =" + ob.area(5, 3, 8));
        System.out.println("Area of Rhombus =" + ob.area(5.3, 4.5));
    }
}
