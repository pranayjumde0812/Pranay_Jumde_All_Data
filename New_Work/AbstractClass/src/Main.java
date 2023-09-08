public class Main {
    public static void main(String[] args) {

        Contractor contractor = new Contractor(6);
        FullTimeEmployee ft = new FullTimeEmployee(10);

        contractor.name = "Pranay";
        contractor.paymentPerHour = 500 ;
        contractor.calculateSalary();


        ft.name = "Pavan";
        ft.paymentPerHour = 350 ;
        ft.calculateSalary();

    }
}