public class Pizza {
    private int price;

    private final int basePizzaPrice;
    private final int extraCheesePrice = 100;
    private final int extraToppingsPrice = 120;
    private final int backPackPrice = 20;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptForTakeAway = false;

    public Pizza(Boolean isVeg) {

        if (isVeg) {
            this.price = 300;
        } else {
            this.price = 400;
        }

        basePizzaPrice = this.price;
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }

    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        this.price += extraToppingsPrice;
    }

    public void takeAway() {
        isOptForTakeAway = true;
        this.price += backPackPrice;
    }

    public void getBill() {
        String bill = "";
        System.out.println("--------------------------------");
        System.out.println("Base Price     : " + basePizzaPrice);
        if (isExtraCheeseAdded) {
            bill += "Extra Cheese   : " + extraCheesePrice + "\n";
        }
        if (isExtraToppingsAdded) {
            bill += "Extra Toppings : " + extraToppingsPrice + "\n";
        }
        if (isOptForTakeAway) {
            bill += "Paper Bag      : " + backPackPrice + "\n";
        }

        bill += "Total Amount   : " + this.price;
        System.out.println(bill);
        System.out.println("--------------------------------");


    }

}
