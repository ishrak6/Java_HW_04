package MethodOverloading;

import java.util.Scanner;

public class Ovrld {

    void check() {
        System.out.println("No parameters");
    }

    void check(int a) {
        System.out.println("Parameter with value: " + a);
    }

    void check(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    double check(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}

class Overload {

    public static void main(String args[]) {
        Ovrld ob = new Ovrld();
        double result;

        ob.check();
        ob.check(10);
        ob.check(10, 20);
        result = ob.check(123.25);
        System.out.println("Result of ob.check(123.25): " + result);
    }
}
