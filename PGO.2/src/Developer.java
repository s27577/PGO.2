import java.util.ArrayList;
import java.util.List;

public class Developer extends Employee {
    private List<Technology> technologies;

    public Developer(String firstName, String lastName, String address, String email, int PESEL, int yearsOfEmployment, List<Technology> technologies) {
        super(firstName, lastName, address, email, PESEL, yearsOfEmployment);
        this.technologies = technologies;
    }

    @Override
    public double calculateSalary() {
        double bonus = 0;
        for (Technology technology : technologies) {
            bonus += technology.getBonus();
        }
        return super.calculateSalary() + bonus;
    }
}
