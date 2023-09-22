package hillel.lesson4;

import java.util.Scanner;

public class Homework4_4 {

    public static void main(String[] array) {

        Scanner scanner = new Scanner(System.in);

        int UserPassword;
        int ExpectedPassword = 8921824;
        do {
            System.out.println(" Fill password ");
            UserPassword = scanner.nextInt();
        } while (UserPassword != ExpectedPassword);
        System.out.println(" Login succesful!");
    }
}
