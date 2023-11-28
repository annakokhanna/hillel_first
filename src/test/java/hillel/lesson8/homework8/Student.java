package hillel.lesson8.homework8;

public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayStudentInfo() {

        if (this != null) {
            System.out.println("Student name is - " + name);
            System.out.println("He is " + age + " years old");
        } else {
            System.out.println("null");
        }
//        System.out.println( "Student name is - " + name + " He is " + age + " years old");
    }


    public static void main(String[] args) {

        Student student = new Student("Andrei", 29);
        student.displayStudentInfo();


        // name = null
        System.out.println("" + "");
        student.setName(null);
        student.displayStudentInfo();

        //object Student = null
        System.out.println("" + "");
        Student student2 = null;

        if (student2 != null) {
            student2.displayStudentInfo();
        } else {
            System.out.println("Not found - null");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}