package composition;

public class Refrigerator {
    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    private boolean hasWorkToDo = false;

    public Refrigerator(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if(!hasWorkToDo) {
            hasWorkToDo = true;
            System.out.println("Ordering Food");
            hasWorkToDo = false;
        }else {
            System.out.println("Refrigerator is in working on some other task. Wait!");
        }
    }

}
