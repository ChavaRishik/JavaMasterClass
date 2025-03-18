package oops.master.challenge;

public class Meal {
    private Burger burger;
    private Drink drink;
    private SideItem sideItem;
    public Meal() {
        burger = new Burger("regular", 100);
        drink = new Drink("coke", "small");
        sideItem = new SideItem("fries");
    }

    public Meal(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "burger=" + burger +
                ", drink=" + drink +
                ", sideItem=" + sideItem +
                '}';
    }

    public double Bill(){
        double totalAmount = 0;
        double burgerPrice = burger.getBasePrice();
        double drinkPrice = drink.getPrice();
        double sidePrice = sideItem.getPrice();
        totalAmount = burgerPrice + drinkPrice + sidePrice;
        return totalAmount;
    }


}
