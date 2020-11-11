package Constructoroverloading;

import java.util.Scanner;

public class Rectangle {

    int l, b;
    float p, q;

    public Rectangle(int x, int y) {
        l = x;
        b = y;
    }

    public int first() {
        return (l * b);
    }

    public Rectangle(int x) {
        this.l = x;
        this.b = x;
    }

    public int second() {
        return (l * b);
    }

    public Rectangle(float x) {
        this.p = x;
        this.q = x;
    }

    public float third() {
        return (p * q);
    }

    public Rectangle(float x, float y) {
        this.p = x;
        this.q = y;
    }

    public float fourth() {
        return (p * q);
    }
}

class ConsOverload {

    public static void main(String args[]) {
        Rectangle rectangle1 = new Rectangle(20, 40);
        int r1 = rectangle1.first();
        System.out.println("Area of 1st Rectangle is: " +r1);
        Rectangle rectangle2 = new Rectangle(50);
        int r2 = rectangle2.first();
        System.out.println("Area of 2nd Rectangle is: " +r2);
        Rectangle rectangle3 = new Rectangle(2.0f);
        int r3 = rectangle1.first();
        System.out.println("Area of 3rd Rectangle is: " +r3);
        Rectangle rectangle4 = new Rectangle(3.0f, 2.0f);
        int r4 = rectangle1.first();
        System.out.println("Area of 4th Rectangle is: " +r4);

    }
}
