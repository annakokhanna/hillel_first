package hillel.lesson7.homework7;

import org.testng.annotations.Test;

public class RectangleTest {

    @Test
    public void checkAreaAndPerimeter() {

        Rectangle rectangle = new Rectangle();
        rectangle.height = 4;
        rectangle.width = 2;

        rectangle.calculatePerimeter();


        Rectangle rectangle2;

        rectangle2 = rectangle;
        rectangle2.height = 4;
        rectangle2.width = 3;

        rectangle2.calculateArea();

    }
}
