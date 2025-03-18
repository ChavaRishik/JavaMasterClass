package composition;

public class CofeeMaker {
    private boolean hasWorkToDo = false;

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public CofeeMaker(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCofee(){
        if(!hasWorkToDo) {
            hasWorkToDo = true;
            System.out.println("CofeeMaker: brewing coffee");
            hasWorkToDo = false;
        }else {
            System.out.println("CofeeMaker is in working on some other task. Wait!");
        }
    }

}
