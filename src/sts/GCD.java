package sts;

import java.util.LinkedList;
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        for (int i = 0; i < list.size() - 1; i++) {
            int gc = findGcd(list.get(i), list.get(i + 1));
            list.add(i + 1, gc);
            i++;
        }

        System.out.println("Updated list with GCDs:");
        System.out.println(list);
    }

    private static int findGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGcd(b, a % b);
    }
}

