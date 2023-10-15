package hillel.lesson7.homework7;

import org.testng.annotations.Test;

public class RectangleTest {

    @Test
    public void checkAreaAndPerimeter() {

        Rectangle rectangle = new Rectangle();
        rectangle.height = 4;
        rectangle.width = 2;

        double perimeter = 2 * rectangle.height + 2 * rectangle.width;
        System.out.println(" Perimeter = " + perimeter + "cm2");


        Rectangle rectangle2;

        rectangle2 = rectangle;
        rectangle2.height = 4;
        rectangle2.width = 3;

        double area = rectangle2.height * rectangle2.width;
        System.out.println(" Area = " + area + " cm2");

    }

}
