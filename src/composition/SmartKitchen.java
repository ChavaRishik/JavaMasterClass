package composition;

public class SmartKitchen {

    private CofeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(CofeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

    public void addWater(){
        brewMaster.brewCofee();
    }

    public void pourMilk(){
        iceBox.orderFood();
    }

    public void loadDishWasher(){
        dishWasher.doDishes();
    }

    public void setKitchenState(boolean cofeeWork, boolean dishWork, boolean refrigeratorWork){
        brewMaster.setHasWorkToDo(cofeeWork);
        dishWasher.setHasWorkToDo(dishWork);
        iceBox.setHasWorkToDo(refrigeratorWork);
    }


}
