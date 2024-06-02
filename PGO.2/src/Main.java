import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
// Creating and adding developers
        List<Technology> developerTechnologies = new ArrayList<>();
        Developer dev = new Developer("John", "Doe", "New York", "john@doe.com", 123456789, 2, developerTechnologies);
        Technology t = new Technology("Python", 800);
        developerTechnologies.add(t);
        employees.add(dev);
// Creating and adding testers
        List<String> testerTestTypes = new ArrayList<>();
        Tester tester = new Tester("Jane", "Smith", "Los Angeles", "jane@smith.com", 987654321, 3, testerTestTypes);
        testerTestTypes.add("UI/UX");
        employees.add(tester);
// Creating and adding a manager
        List<Goal> managerGoals = new ArrayList<>();
        Manager manager = new Manager("Bob", "Johnson", "Chicago", "bob@johnson.com", 1122334455, 5, managerGoals);
        Goal g = new Goal("Implementing FB login",LocalDate.of(2022, 4, 15), 1500);
        managerGoals.add(g);
        employees.add(manager);
// Calculating total amount to be paid
        int totalAmount = 0;
        for (Employee employee : employees) {
            totalAmount += employee.calculateSalary();
        }
        System.out.println("Total amount to be paid this month: " + totalAmount + " USD");
    }
}
