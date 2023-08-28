package BankAccount;

public class BankManager {
    Account account;

    public Account createAccount(char type) {
        if (type == 'S') {
            account = new Saving();
        } else {
            account = new Loan();
        }
        return account;
    }
}
