package hillel.lesson10_11.homework10_11;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String name, String address, double salary, String programmingLanguage) {
        super(name, address, salary, "Developer");
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String workInformation() {
        return super.workInformation() + " They write code in " + programmingLanguage + ".";
    }
}