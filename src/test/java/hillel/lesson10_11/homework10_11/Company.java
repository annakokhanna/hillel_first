package hillel.lesson10_11.homework10_11;

public class Company {

    public static void main(String[] args) {
        Manager manager = new Manager("Andrei Manager", "Fontanska St, 53", 60000);
        Developer developer = new Developer("Sveta Developer", "Olexand St, 87", 70000, "Java");
        QA qa = new QA("Ivan QA", "Pinets St, 23", 55000);

        System.out.println(manager.performanceReport());
        System.out.println(developer.workInformation());
        System.out.println(qa.calculateBonus());

        Employee employee1 = new Employee("Viorika Bobova", "Main St, 48", 50000, "Employee");
        Employee employee2 = new Employee("Viorika Bobova", "Main St, 48", 50000, "Employee");

//        equals()
        System.out.println(employee1.equals(employee2));
//        hashCode()
        System.out.println(employee1.hashCode() == employee2.hashCode());
//        toString()
        System.out.println(employee1.toString());
    }
}
