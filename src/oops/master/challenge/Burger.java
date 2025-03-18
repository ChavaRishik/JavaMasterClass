package oops.master.challenge;

public class Burger {
    private String burgerType;
    private double basePrice;
    public Burger(String burgerType, double basePrice) {
        this.burgerType = burgerType;
        this.basePrice = basePrice;
    }
    public String getBurgerType() {
        return burgerType;
    }
    public double getBasePrice() {
        return basePrice;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "burgerType='" + burgerType + '\'' +
                ", basePrice=" + basePrice +
                '}';
    }
}
