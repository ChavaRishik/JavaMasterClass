package polymorphism;

public class Car {
    private String description;
    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Car Engine Started");
    }

    public void drive(){
        runEngine();
        System.out.println("Car Driving "+ getClass().getSimpleName());
    }

    protected void runEngine() {
        System.out.println("Car Engine Running");
    }

}
