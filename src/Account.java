public class Account {
    private double balance;


    public Account() {
        balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Транзакция проведена успешно");
        } else {
            System.err.println("Транзакция отменена, пополните баланс");
        }

    }

    public void getBalance() {
        System.out.println("Ваш баланс: " + balance);

    }
}
