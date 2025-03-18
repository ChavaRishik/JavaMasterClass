package sts;

public class CustomStack {

    int top = -1;
    int sizeOfArr = 10;



    public CustomStack(int size) {
        this.sizeOfArr = size;

    }
    int[] arr = new int[sizeOfArr];

    public  int size(){
        return top + 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == sizeOfArr - 1;
    }

    public void push(int value) {
        if(isFull()) {
            System.out.println("Stack is full");
            return;
        }
        System.out.println("Pushing " + value + " to the stack");
        arr[++top] = value;
    }

    public int pop(){
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        System.out.println("Poping " + arr[top] + " from the stack");
        return arr[top--];
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return arr[top];
    }

    public void display() {
        if(isEmpty()) {
            return;
        }
        System.out.println("Displaying Stack");
        for(int i = top; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
