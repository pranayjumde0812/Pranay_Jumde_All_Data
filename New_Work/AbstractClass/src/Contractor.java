public class Contractor extends Employee {

    int workingHours;

    public Contractor(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    void calculateSalary() {

        long salary = workingHours * paymentPerHour;

        System.out.println("Contractor : " + name + " earn " + salary + " Salary");

    }
}
