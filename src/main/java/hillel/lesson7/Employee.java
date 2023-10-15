package hillel.lesson7;

public class Employee {

    public String name;
    public String jobTitle;
    public int experience;
    public double salary;

    public Employee() {
        name = "Rone Whislye";
        jobTitle = "Dev";
        experience = 0;
        salary = 300;
    }

    public Employee(String name, String jobTitle, int experience, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.experience = experience;
        this.salary = salary;
    }

    public Employee(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.experience = 0;
        this.salary = 300;
    }

    public void calculateSalary() {
        System.out.println("Employee " + name + " has updated salary " + (salary + salary * experience / 100));
    }


    public double calculateSalarySum() {
        return salary + salary * experience / 100;
    }

    public void updateEmployeeData(String newName, String newTitle, int updateExperience, double newSalary) {
        name = newName;
        jobTitle = newTitle;
        experience = updateExperience;
        salary = newSalary;
    }
}
