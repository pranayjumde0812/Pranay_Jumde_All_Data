package BankAccount;

public class Saving implements Account {
    @Override
    public void deposit() {
        System.out.println("Depositing money in Saving Account");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdraw money from Saving Account");
    }
}
