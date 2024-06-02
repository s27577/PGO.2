import java.util.List;

public class Tester extends Employee {
    private List<String> testTypes;
    private final int testBonus = 300;

    public Tester(String firstName, String lastName, String address, String email, int PESEL, int yearsOfEmployment, List<String> testTypes) {
        super(firstName, lastName, address, email, PESEL, yearsOfEmployment);
        this.testTypes = testTypes;
    }

    @Override
    public double calculateSalary() {
        double bonus = testTypes.size() * testBonus;
        return super.calculateSalary() + bonus;
    }
}

