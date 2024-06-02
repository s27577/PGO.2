import java.util.List;
import java.time.LocalDate;

public class Manager extends Employee {
    private List<Goal> goals;

    public Manager(String firstName, String lastName, String address, String email, int PESEL, int yearsOfEmployment, List<Goal> goals) {
        super(firstName, lastName, address, email, PESEL, yearsOfEmployment);
        this.goals = goals;
    }

    public double calculateSalary() {
        double bonus = 0;
        LocalDate now = LocalDate.now();
        for (Goal goal : goals) {
            if (goal.getDate().getMonthValue() == now.getMonthValue() && goal.getDate().getYear() == now.getYear()) {
                bonus += goal.getBonus();
            }
        }
        return super.calculateSalary() + bonus;
    }
}
