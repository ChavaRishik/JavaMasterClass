package polymorphism;

public class HybridCar extends Car {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("The car is running with %d batteries and %d gas cylinders %n", batterySize,cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.println("The Hybrid car is running on gas");
    }
}
