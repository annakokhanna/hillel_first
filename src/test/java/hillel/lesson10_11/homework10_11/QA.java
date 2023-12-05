package hillel.lesson10_11.homework10_11;

public class QA extends Employee {

    public QA(String name, String address, double salary) {
        super(name, address, salary, "QA");
    }

    @Override
    public String workInformation() {
        return super.workInformation() + " They ensure the quality of the software.";
    }
}
