package polymorphism;

public class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;


    public GasPoweredCar(String desc, double avgKmPerLitre, int cylinders) {
        super(desc);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }
}
