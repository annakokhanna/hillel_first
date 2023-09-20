package hillel.lesson4;

import java.util.Scanner;

public class Homework4_4 {

    public static void main(String[] array) {

        Scanner scanner = new Scanner(System.in);

        int password;
        System.out.println(" Fill password ");

        do {
            password = scanner.nextInt();
        } while (password != 98999);
        System.out.println(password);
    }
}
