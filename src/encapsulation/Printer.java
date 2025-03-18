package encapsulation;

public class Printer {
    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel > 0 && tonerLevel < 100) ? tonerLevel : -1 ;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public int addToner(int tonerAmount){
       int temp = tonerLevel + tonerAmount;
       if(temp < 0 || temp > 100){
           temp = -1;
       }else{
           tonerLevel = temp;
       }
       return temp;
    }
    public void addPagesPrinted(int pagesPrinted){

    }

}
