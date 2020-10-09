package exercise2;

import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 7: ");
        int day = input.nextInt();

        if (day == 1) {
<<<<<<< HEAD
          System.out.println("Day of week: Monday");
        } else if (day == 2) {
          System.out.println("Day of week: Teusday");
        } else if (day == 3) {
          System.out.println("Day of week: Wednesday");
        } else if (day == 4) {
          System.out.println("Day of week: Thursday");
        } else if (day == 5) {
          System.out.println("Day of week: Freiday");
        } else if (day == 6) {
          System.out.println("Day of week: Saterday");
        } else if (day == 7) {
          System.out.println("Day of week: Sunday");
=======
          System.out.println("Day of the week: Monday");
        } else if (day == 2) {
          System.out.println("Day of the week: Teusday");
        } else if (day == 3) {
          System.out.println("Day of the week: Wednesday");
        } else if (day == 4) {
          System.out.println("Day of the week: Thursday");
        } else if (day == 5) {
          System.out.println("Day of the week: Freiday");
        } else if (day == 6) {
          System.out.println("Day of the week: Saterday");
        } else if (day == 7) {
          System.out.println("Day of the week: Sunday");
>>>>>>> 6df4fc25177ea057d1e428916bab9daee97e86e7
        } else{
          System.out.println("Inavalid day");
        }

    }
}