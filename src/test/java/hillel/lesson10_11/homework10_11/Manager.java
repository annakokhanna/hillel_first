package hillel.lesson10_11.homework10_11;

public class Manager extends Employee {

    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager - ");
    }

    @Override
    public double calculateBonus() {
        return 0.1 * getSalary();
    }

    @Override
    public String performanceReport() {
        return super.performanceReport() + " -> Excellent";
    }
}
