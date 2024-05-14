package lab06.task05;

import java.util.Scanner;

public class User {
    private Scanner scanner = new Scanner(System.in);

    public void getInfo() {
        System.out.println("Возраст " + scanner.nextInt());
    }

    public Scanner getScanner() {
        return scanner;
    }
}

