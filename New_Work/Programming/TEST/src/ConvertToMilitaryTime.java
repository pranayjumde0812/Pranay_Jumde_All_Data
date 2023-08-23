import java.util.Scanner;

public class ConvertToMilitaryTime {

    public void convertTo24HoursFormat(String time) {

        int h1 = time.charAt(0) - 48;
        int h2 = time.charAt(1) - 48;

        int hh = (h1 * 10 + h2 % 10);

        // IF TIME is in AM
        if (time.charAt(9) == 'A') {

            if (hh == 12) {
                System.out.print("00");
                for (int i = 2; i <= 7; i++) {
                    System.out.print(time.charAt(i));
                }
            } else {
                for (int i = 0; i <= 7; i++) {
                    System.out.print(time.charAt(i));
                }
            }
        } else {
            if (hh == 12) {
                for (int i = 0; i <= 7; i++) {
                    System.out.print(time.charAt(i));
                }
            } else {
                hh = hh + 12;
                System.out.print(hh);
                for (int i = 2; i <= 7; i++) {
                    System.out.print(time.charAt(i));
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time in following format");
        System.out.println("HH:MM:SS AM (or) HH:MM:SS PM");
        String time = sc.nextLine();


        ConvertToMilitaryTime c2m = new ConvertToMilitaryTime();

        c2m.convertTo24HoursFormat(time);

    }

}
