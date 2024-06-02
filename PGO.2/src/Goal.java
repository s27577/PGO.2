import java.time.LocalDate;
public class Goal {
    private String name;
    private LocalDate date;
    private int bonus;

    public Goal(String name, LocalDate date, int bonus) {
        this.name = name;
        this.date = date;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }
    public int getBonus() {
        return bonus;
    }
}
