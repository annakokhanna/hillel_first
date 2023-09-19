package hillel.lesson3;

import java.util.Scanner;

public class Homework3_1 {

    public static void main(String[] args) {

        System.out.println("Enter number from 1 to 7");
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error !!! You should enter numbers from 1 to 7");
        }
    }
}