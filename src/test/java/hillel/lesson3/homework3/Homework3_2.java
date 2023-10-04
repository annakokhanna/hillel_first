package hillel.lesson3.homework3;

import java.util.Scanner;

public class Homework3_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("  Fill number for a" );
        double a = scan.nextDouble();
        System.out.println(" Fill number for b" );
        double b = scan.nextDouble();
        System.out.println("  Fill number for c" );
        double c = scan.nextDouble();

        double discriminant  = Math.pow(b, 2) -  4 * a * c;
        System.out.println("discriminant = " + discriminant );

        if (discriminant > 0) {
            double discriminantSqrt = Math.sqrt(discriminant);
            double resultOne = (-b + discriminantSqrt / 2 * c);
            double resultTwo = (-b - discriminantSqrt / 2 * c);
            System.out.println("discriminantSqrt = " + discriminantSqrt);
            System.out.println("You have 2 square root " + resultOne + " and " + resultTwo);
        }
        else if (discriminant == 0) {
            double resultThree = discriminant / 2 * c;
            System.out.println("If discriminant = 0, than square root also = 0" + resultThree);
        }
        else {
            System.out.println("We can't find square root if discriminant < 0" );
        }
    }
}
