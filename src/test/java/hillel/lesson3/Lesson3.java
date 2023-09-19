package hillel.lesson3;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] args) {

        int months[];
        int[] month2;
        months = new int[12];

        months[0] = 1;
        months[1] = 2;
        months[2] = 3;
        months[3] = 4;
        months[4] = 5;

        System.out.println(months.length);

//        month2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
//        month2[12] = 111;
//        System.out.println(month2[12]);
//
//        month2 = new int []{99, 22, 55};
    }

    @Test
    public void two() {
        int[][] twoDimArr; // = new int[3][4];

        twoDimArr = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println(twoDimArr[2][1]);
    }

    int twoDimArr2[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
    };

    @Test
    public void three() {

        int a = 4, b = 3;
        if (a == b) {
            System.out.println("ok1");
            System.out.println("ok2");
            System.out.println("ok3");
        }
//        else System.out.println("99999");
    }

    @Test
    public void four() {
        boolean loginFiled = true, pwdFiled = true;
        boolean rememberMe = true;

        if (loginFiled && pwdFiled) {
            if (rememberMe)
                System.out.println("ok");
            else System.out.println("it is a pity");

            System.out.println("submit button active");
        }
        else if (pwdFiled) {
            System.out.println("fill the login");
        }
        else if (loginFiled) {
            System.out.println("fill the pwd");
        }
        else System.out.println("do anything");
    }

    @Test
    public void five() {

        int autumnMonth = 10;
        switch (autumnMonth) {
            case 1:
                System.out.println("september");
                break;
            case 2:
                System.out.println("october");
                break;
            case 3:
                System.out.println("november");
                break;
            default:
                System.out.println("out of scope");
        }
    }


    @Test
    public void six() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");

        int number = scan.nextInt();
        System.out.println("your number is " + number);

//        сканирование разных типов данных - ниже примеры
//        scan.nextInt();
//        scan.nextDouble();
//        scan.nextLine();


    }
}
