package exercise2;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a radius: ");
        int radius = input.nextInt();

<<<<<<< HEAD
        double c = 2.0 * Math.PI * radius;
        System.out.println("Circumference: " + c);

        double a = Math.PI * radius * radius;
=======
        double c = 2.0*3.1498629965179976*radius;
        System.out.println("Circumference: " + c);

        double a = 3.1498629965179976*radius*radius;
>>>>>>> 6df4fc25177ea057d1e428916bab9daee97e86e7
        System.out.println("Area: " + a);

    }
}