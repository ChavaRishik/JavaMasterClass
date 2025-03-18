package oops.master.challenge;

public class SideItem {
    private String type;
    private double price;
    public SideItem(String type) {
        this.type = type;
        this.price = getPrice();
    }
    public double getPrice() {
        if(type.equals("C")){
            return 10;
        } else if (type.equals("fries")) {
            return 20;
        }
        return 25;
    }

    @Override
    public String toString() {
        return "SideItem{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
