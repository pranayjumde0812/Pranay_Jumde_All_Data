public class Account {

    private int accountNumber;
    private double balance;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void depositeMoney(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit \u20B9" + amount + "added to this " + accountNumber);
        } else {
            System.out.println("invalid amount ");
        }
    }

    public void withDraw(double amount) {
        if (balance >= amount && amount > 0) {
            balance -= amount;
            System.out.println("Withdraw \u20B9" + amount + "from this" + accountNumber);
        } else {
            System.out.println("Insufficient balance...");
        }
    }
}
