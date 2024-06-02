public class Employee {
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private int PESEL;
    private int yearsOfEmployment;

public Employee(String firstName, String lastName, String address, String email, int PESEL, int yearsOfEmployment) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.email = email;
    this.PESEL = PESEL;
    this.yearsOfEmployment = yearsOfEmployment;
}
    public double calculateSalary() {
        return 3000 + (this.yearsOfEmployment * 1000);
    }
}
