package exercise2;

import java.util.Scanner;
import java.lang.*;

public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = input.nextInt();
        System.out.print("Enter coefficient b: ");
        double b = input.nextInt();
        System.out.print("Enter coefficient c: ");
        double c = input.nextInt();

        if (a==0) {

            if (b==0) {

                if (c==0) {

                    System.out.println("Many values");
                } else {

                    System.out.println("No values");
                }
            }else {

                double x = (-c)/b;
                System.out.println("x = " + x);
            }
        }else {

            double D = b * b - 4 * a * c;
            if (D>0) {

                double koren = Math.sqrt(D);
               double x1 = (-b + koren) / (2 * a);
               System.out.println("x1 = " + x1);
                double x2 = (-b - koren) / (2 * a);
                System.out.println("x2 = " + x2);
            }else if (D==0) {

                double x0 = (-b)/(2*a);
                System.out.println("x = " + x0);
            }else {
                
                System.out.println("Imaginary values");
            }
        }       
    }
}