package hillel.lesson7.lesson7;

import hillel.lesson7.Employee;
import org.testng.annotations.Test;

public class EmployeeTest {

    @Test
    public void createNewEmployee() {
        Employee employee1 = new Employee();

        employee1.name = "John Wick";
        employee1.jobTitle = "QA Engineer";
        employee1.experience = 1;
        employee1.salary = 1000.00;

        double salaryRaise = employee1.salary + employee1.salary * employee1.experience / 100;
        System.out.println(" After promotion employee " + employee1.name + " has salary " + salaryRaise);

        Employee employee2 = new Employee();

        employee1 = employee2;

        employee2.experience = 8;
        System.out.println(employee1.experience);

    }

    @Test
    public void checkMethod() {

        Employee employee1 = new Employee();

        employee1.name = "Ron Green";
        employee1.jobTitle = "Engineer";
        employee1.experience = 10;
        employee1.salary = 5000.00;

        employee1.calculateSalary();

        System.out.println(employee1.calculateSalarySum());

        employee1.updateEmployeeData("Anna Frank", "BA", 12, 22100);
        System.out.println(employee1.name + " " + employee1.jobTitle + " " + employee1.experience + " " + employee1.salary);
    }

    @Test
    public void checkConstructorOne() {
        Employee employeeDefault = new Employee();
        System.out.println(employeeDefault.name);
    }


    @Test
    public void checkConstructorTwo() {
        Employee employee1 = new Employee();
        System.out.println(employee1.name);


        Employee employee2 = new Employee("Harry Potter", "magician", 22, 7000.00);
        System.out.println(employee2.name);

    }
}

