package exercise2;

import java.util.Scanner;

public class EvenOrOddNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int preslava = number % 2;

        if (preslava == 1) {
          System.out.println("Number is odd");
        } else {
          System.out.println("Number is even");
        }
    }
}