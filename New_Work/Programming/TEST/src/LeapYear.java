import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();

        LeapYear leapYear = new LeapYear();

        boolean result = leapYear.findLeapYear(year);

        if (result) {
            System.out.println("The year " + year + " is leap year.");
        } else
            System.out.println("The year " + year + " is not a leap year.");
    }

    public boolean findLeapYear(int year) {

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        }
        return false;
    }
}
