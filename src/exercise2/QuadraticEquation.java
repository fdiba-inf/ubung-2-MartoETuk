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

        
        if (a != 0) {
            double D = b * b - 4 * a * c;
            if (D > 0) {
              double squareRoot = Math.sqrt(D);
              double x1 = (- b + squareRoot) / (a * 2);
              double x2 = (- b - squareRoot) / (a * 2);
              System.out.println(x1);
              System.out.println(x2);
            } else if (D == 0){
              double x = (- b) / (a * 2);
              System.out.println(x);
              System.out.println(x);
            } else {
              System.out.println("Imaginary values");
            }
        } else if (b != 0) {
            double x3 = - (c / b);
            System.out.println(x3);
        } else if (c != 0) {
            System.out.println("No values");
        } else {
            System.out.println("Many values");
        }
               
    }
}