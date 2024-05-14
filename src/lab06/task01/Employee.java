package lab06.task01;

public class Employee extends Human {
    private String bankName;

    public Employee(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }

    @Override
    public void printInfo() {
        System.out.println(getFirstName() + " " + getLastName()
                + " работает в " + bankName);
    }
}
