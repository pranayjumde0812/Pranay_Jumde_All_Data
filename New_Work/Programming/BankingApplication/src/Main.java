public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        Customer customer1 = new Customer("Pranay Jumde");

        Account account1 = new Account(123);
        Account account2 = new Account(456);

        customer1.addAccount(account1);
        customer1.addAccount(account2);


        customer1.displayAccountDetails();
        account1.depositeMoney(10000);
        account1.withDraw(4000);

        customer1.displayAccountDetails();

        bank.addCustomer(customer1);

        String s = null;
    }
}