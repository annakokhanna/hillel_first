package hillel.lesson3.homework3;

import java.util.Scanner;

public class Homework3_3 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if ((number % 4 == 0 && number % 100 != 0) || (number % 400 == 0)) {
            System.out.println(number + " - it is leap year");
        } else {
            System.out.println(number + " - it is simple year");
        }
    }
}


//        Залишила два варіанта виконання
//
//        if ((number % 4 == 0 && number % 100 != 0)){
//            System.out.println(number + " - it is leap year");
//        }
//        else if (number % 400 == 0) {
//            System.out.println(number + " - it is leap year");
//        }
//        else {
//            System.out.println(number + " - it is simple year");
//        }
//    }
//}