package BankAccount;

public class Loan implements Account {
    @Override
    public void deposit() {
        System.out.println("Depositing money in Loan Account");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdraw money in Loan Account");
    }
}
