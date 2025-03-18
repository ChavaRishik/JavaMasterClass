package oops.master.challenge;

public class DeluxeBurger extends Burger{
    private double setPrice;
    public DeluxeBurger(String burgerType, double basePrice) {
        super(burgerType, basePrice);
        this.setPrice = basePrice+100.00;
    }

    @Override
    public String toString() {
        return "DeluxeBurger{" +
                "setPrice=" + setPrice +
                '}';
    }
}
