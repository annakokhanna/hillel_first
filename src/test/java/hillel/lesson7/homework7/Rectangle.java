package hillel.lesson7.homework7;

public class Rectangle {

    int width;
    int height;


    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int calculatePerimeter() {
        double perimeter = 2 * height + 2 * width;
        System.out.println(" Perimeter = " + perimeter + " cm2");
        return 0;
    }

    public void calculateArea() {
        double area = height * width;
        System.out.println(" Area = " + area + " cm2");
    }
}
