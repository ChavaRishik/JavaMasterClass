package pat;/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
class Test
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        Node head = null;
        Node curr = null;
        for(int i = 0; i < input.length; i++){
            int value = Integer.parseInt(input[i]);

            if(head == null){
                head = new Node(value);
                curr = head;
            }else{
                curr.next = new Node(value);
                curr = curr.next;
            }
        }
        reorderList(head);
        printList(head);


    }

    public static void reorderList(Node head){
        if(head == null) return;
        Node curr = head;
        Node prev = null;
        Node next = head.next;
        while(curr.next != null){
            prev = curr;
            curr = curr.next;
        }

        prev.next = null;
        head.next = curr;
        curr.next = next;
        reorderList(next);
    }

    public static void printList(Node head){
        Node curr = head;

        while(curr != null){
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
    }
}

class Node{
    int value;
    Node next;

    public Node(int value){
        this.value = value;
    }
}
