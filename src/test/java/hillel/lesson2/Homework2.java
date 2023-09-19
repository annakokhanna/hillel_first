package hillel.lesson2;

import org.junit.jupiter.api.Test;

public class Homework2 {

    public static void main(String[] args) {

        int number1 = 5;
        int number2 = 10;

        String result = (number1 > number2) ? "Number 1 is larger" : "Number 2 is larger or equal";

        System.out.println(result);
    }

    @Test
    public void mainer () {
        int x=10;
        int y=20;
        int z=30;
        String result = (x > y) ? (x > z) ? "x is greatest" : "z is greatest" : (y > z) ? "y is greatest" : "z is greatest";
        System.out.println(result);
    }

    @Test
    public void two() {
        int nr1 = 17;
        int nr2 = 18;

        String result1 = (nr1 % 2 == 0) ? "even number" : "odd number";
        String result2 = (nr2 % 2 == 0) ? "even number" : "odd number";

        System.out.println(nr1 + " is " + result1 + " " +
                " " +  nr2 + " is " + result2 );


    }
    @Test
    public void three() {
        double l = 10.5;
        int h = 15;
        double s;
        double v;
         s = ( l * l );
         v = (s * h)/3.0;
        System.out.println(s + " is area of the base of a square pyramid " + "  "
                +  v + " is volume of a square pyramid" );

    }
}