public class FullTimeEmployee extends Employee {

    int workingHours;

    public FullTimeEmployee(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    void calculateSalary() {

        long salary = workingHours * paymentPerHour;

        System.out.println("FullTimeEmployee : " + name + " earn " + salary + " salary");
    }
}
