package hillel.lesson4;

import java.util.Scanner;

public class myTask {

    public static void main(String[] array) {


//  1
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fill number s = ");
        int s = scanner.nextInt();

        System.out.println("Fill number d = ");
        int d = scanner.nextInt();
        int res = (s * d);

        if (res % 2) {
            System.out.println(" number " + res);
        }
        if else{
            System.out.println(" Other numbers " + res);
        }
    }

//        System.out.println(" s * d ");



//        int[][] numbers = { {1, 2, 3, 4}, {1, 2, 3, 4} };
//        int res = (numbers[0][3] * numbers [1][2]);
//        System.out.println(res);


//        3
//        int numbers[] = {1, 2, 3, 4, 5, 6, 8, 9, 10};
//        for (int i = 0; i < numbers.length; i++)
//        System.out.println(numbers[i]);



}