package sts;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueRotation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.add(sc.nextInt());
        }
        int k = sc.nextInt();
        rotate(q, k);
    }

    private static void rotate(Queue<Integer> q, int k) {
        for (int i = 0; i < k; i++) {
            q.add(q.poll());
        }
        System.out.println(q);
    }
}
