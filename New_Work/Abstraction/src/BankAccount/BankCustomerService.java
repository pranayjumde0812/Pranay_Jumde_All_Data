package BankAccount;

public class BankCustomerService {
    public static void main(String[] args) {

        // This is example of abstraction with the help of Interface

        BankManager bankManager = new BankManager();

        Account type = bankManager.createAccount('S');

        type.deposit();
        type.withdraw();
    }

    /*
       Abstraction: Hiding the implementation details of class
                    and exposing only the behaviours of object is
                    called Abstraction.

       Abstraction is helpful in  developing the API.

       Steps to achieve abstraction:
       1) Generalized all the behaviours of implementation classes in the interface. (Account interface)
       2) Create the object of implementation class and store the address in interface reference variable. (In bank manager class)
       3) Us the interface reference variable to call method of implementation class. (In this class using type)

     */
}
