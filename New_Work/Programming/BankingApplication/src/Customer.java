import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private List<Account> accountList;

    public Customer(String name) {
        this.name = name;
        this.accountList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        accountList.add(account);
        System.out.println("Account " + account.getAccountNumber() + " is added for customer " + getName());
    }

    public double getTotalAccountBalance() {
        double totalBalance = 0;
        for (Account account : accountList) {
            totalBalance += account.getBalance();
        }
        return totalBalance;
    }

    public void displayAccountDetails() {
        System.out.println("Customer : " + getName());
        System.out.println("Account details");

        for (Account account : accountList) {
            System.out.println("Account No. " + account.getAccountNumber());
            System.out.println("Account Balance \u20B9" + account.getBalance());
        }

        System.out.println("Total Balance is : \u20B9" + getTotalAccountBalance());
    }
}
