package composition;

public class DishWasher {
    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    private boolean hasWorkToDo = false;

    public DishWasher(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    protected void doDishes(){
        if(!hasWorkToDo) {
            hasWorkToDo = true;
            System.out.println("Doing Dishes");
            hasWorkToDo = false;
        }else {
            System.out.println("Dishwasher is in working on some other task. Wait!");
        }
    }

}
