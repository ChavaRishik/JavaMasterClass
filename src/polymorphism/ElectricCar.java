package polymorphism;

public class ElectricCar extends Car {
    private double avgKmPerLitre;
    private int batterySize;

    public ElectricCar(String desc, double avgKmPerLitre, int batterySize) {
        super(desc);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
    }
}
