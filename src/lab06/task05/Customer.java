package lab06.task05;

public class Customer extends User {
    @Override
    public void getInfo() {
        System.out.println("Имя " + getScanner().nextLine());
    }
}
