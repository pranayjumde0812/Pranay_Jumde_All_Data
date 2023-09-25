package BankQuestion;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program start !!!");

        SBI sbi = new SBI();

        ICICI icici = new ICICI();

        BankBazzar bankBazzar = new BankBazzar();
        bankBazzar.getRateOfInterest(sbi);
        bankBazzar.getRateOfInterest(icici);

        System.out.println("Program ends !!!");
    }
}