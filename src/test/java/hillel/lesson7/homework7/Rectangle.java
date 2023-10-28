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
        return 2 * height + 2 * width;
    }

    public int calculateArea() {
        return height * width;
    }
}
