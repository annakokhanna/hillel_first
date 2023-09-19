package hillel.lesson4;

public class Homework4_1 {

    public static void main(String[] args) {

        int [] numbers = {1, 2, 3, 4, 5, 6, 8, 9, 10};
        for (int i = 1; i < numbers.length; i++) {

                if ((numbers[i] - numbers[i-1]) >1)  {
                    System.out.println("missing number");
                    System.out.println(numbers[i]-1);
                }


        }

    }
}
