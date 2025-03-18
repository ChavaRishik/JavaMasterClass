import java.util.*;

public class Main {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public  void push(int n){
        if(q1.isEmpty()){
            q1.add(n);
        }else{
            while(!q1.isEmpty()){
                q2.add(q1.poll());
            }
            q1.add(n);
            while(!q2.isEmpty()){
                q1.add(q2.poll());
            }
        }
    }
    public int pop(){
        if(q1.isEmpty()){
            return -1;
        }
        return q1.poll();
    }

    public int peek(){
        if(q1.isEmpty()){
            return -1;
        }
        return q1.peek();
    }
}
