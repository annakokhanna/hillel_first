package hillel.lesson10_11.homework10_11;

import java.util.Objects;

public class Employee {

    private String name;
    private String address;
    private double salary;
    private String position;

    public Employee(String name, String address, double salary, String position) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.position = position;
    }

    public double calculateBonus() {
        return 0.05 * salary;
    }

    public String performanceReport() {
        return "Performance report for " + position + " " + name + " -> Good";
    }

    public String workInformation() {
        return position + " is performing their job duties.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(name, employee.name) &&
                Objects.equals(address, employee.address) &&
                Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, salary, position);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }

    public double getSalary() {
        return salary;
    }

}