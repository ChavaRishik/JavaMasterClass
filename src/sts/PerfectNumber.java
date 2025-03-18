package sts;
import java.util.Scanner;
public class PerfectNumber  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a perfect number");
        int n = sc.nextInt();
        isPerfectNumber(n);
        sc.close();
    }

    private static void isPerfectNumber(int n) {
        int sum = 0;
        for(int i = 1; i <= (n/2); i++) {
            if(n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println("Perfect number");
        }else {
            System.out.println("Not a perfect number");
        }
    }
}
