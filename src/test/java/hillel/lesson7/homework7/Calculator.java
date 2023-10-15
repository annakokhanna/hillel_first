package hillel.lesson7.homework7;

import java.util.Scanner;


public class Calculator {

    static Scanner scanner = new Scanner(System.in);
    static double result;


    public static void main(String[] args) {
        System.out.println("First number");
        double num1 = scanner.nextDouble();
        System.out.println("Operation");
        char operation = scanner.next().charAt(0);
        System.out.println("Second number");
        double num2 = scanner.nextDouble();
        result = calculator(num1, num2, operation);
        System.out.println("Result " + result);

    }

    public static double calculator(double numb1, double numb2, char operation) {
        if (operation == '+') {
            result = numb1 + numb2;
        } else if (operation == '-') {
            result = numb1 - numb2;
        } else if (operation == '*') {
            result = numb1 * numb2;
        } else if (operation == '/') {
            result = numb1 / numb2;
        } else {
            System.out.println("Error");
        }
        return result;
    }
}