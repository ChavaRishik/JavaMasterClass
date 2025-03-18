package oops.master.challenge;

public class Drink {
    private String type;
    private String size;
    private double price;
    public Drink(String type, String size) {
        this.type = type;
        this.size = size;
        this.price = getPrice();
    }

    public double getPrice() {
        if(size.equals("small")){
            return 60.00;
        } else if (size.equals("medium")) {
            return 80.00;
        }
        return 100.00;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
