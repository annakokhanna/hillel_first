package hillel.lesson7.homework7.Calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fill first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Fill math operation (+, -, *, /): ");
        String operation = scanner.next();

        System.out.print("Fill second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        switch (operation) {
            case "+":
                result = calculator.add(num1, num2);
                break;
            case "-":
                result = calculator.subtract(num1, num2);
                break;
            case "*":
                result = calculator.multiply(num1, num2);
                break;
            case "/":
                result = calculator.divide(num1, num2);
                break;
            default:
                System.out.println("You can't do this operation");
                break;
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}
