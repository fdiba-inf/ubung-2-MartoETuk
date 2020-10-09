package exercise2;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a radius: ");
        int radius = input.nextInt();

        double c = 2.0 * Math.PI * radius;
        System.out.println("Circumference: " + c);

        double a = Math.PI * radius * radius;
        System.out.println("Area: " + a);

    }
}