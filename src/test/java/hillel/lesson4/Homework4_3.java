package hillel.lesson4;

import java.util.Scanner;

public class Homework4_3 {

    public static void main(String[] array) {


        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num;
        System.out.println("Fill number 0");

        do {
            num = scanner.nextInt();
            sum += num;
        } while (num != 0);


        System.out.println("sum " + sum);
    }
}


