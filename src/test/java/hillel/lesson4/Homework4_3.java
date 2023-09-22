package hillel.lesson4;

import java.util.Scanner;

public class Homework4_3 {

    public static void main(String[] array) {


        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int input;


        do {
            System.out.println("Fill number 0");
            input = scanner.nextInt();
            sum += input;
        } while (input != 0);


        System.out.println("sum :" + sum);
    }
}


