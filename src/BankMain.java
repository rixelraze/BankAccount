import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {


        Account client = new Account();
        double num1 = (Math.random() * 5);
        for (int i = 0; i < num1; i++) client.deposit(500);
        client.getBalance();
        System.out.println("Сколько вы хотите вывести со счета?");
        Scanner scanner = new Scanner(System.in);
        double withdrawal = scanner.nextDouble();
        client.withdraw(withdrawal);
        client.getBalance();

    }
}