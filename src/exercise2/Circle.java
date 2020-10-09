package exercise2;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a radius: ");
        int radius = input.nextInt();

        double c = 2.0*3.1498629965179976*radius;
        System.out.println("Circumference: " + c);

        double a = 3.1498629965179976*radius*radius;
        System.out.println("Area: " + a);

    }
}