import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("For base pizza : Press 1");
        System.out.println("For deluxe pizza : Press 2");
        int response = sc.nextInt();
        System.out.println("For Veg pizza : Press 1");
        System.out.println("For Non-veg pizza : Press 2");
        boolean isVeg = false;
        if (sc.nextInt() == 1) {
            isVeg = true ;
        }

        if(response == 1){
            Pizza basePizza = new Pizza(isVeg);
            basePizza.addExtraCheese();
            basePizza.addExtraToppings();
            basePizza.takeAway();
            basePizza.getBill();

        }else {
            DeluxPizza deluxPizza = new DeluxPizza(isVeg);
            deluxPizza.getBill();
        }




    }
}