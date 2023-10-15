package hillel.lesson7.homework7;

import org.testng.annotations.Test;

public class PersoneTest {

    @Test
    public void createNewPersone() {

        Person person1 = new Person();

        System.out.println("My name is " + person1.name + " I am " + person1.age + " years old");

        person1.name = "John Snow";
        person1.age = 33;

        System.out.println("My name is " + person1.name + " I am " + person1.age + " years old");


        Person person2;
        person2 = person1;

        person2.age = person1.age + 2;
        System.out.println("My name is " + person2.name + " I am " + person2.age + " years old");

    }
}
