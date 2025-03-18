package sts;

public class FibonacciSeries {
    public static void main(String[] args) {
       printDiamond(5);
    }

    public static void fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int f3;
        if(f0 < n){
            System.out.println(f0);
        }
        if(f1 < n){
            System.out.println(f1);
        }

        for(int i = 0; i < n - 2; i++){
            f3 = f0 + f1;
            f0 = f1;
            f1 = f3;
            System.out.println(f3);
        }

    }

    public static  void printDiamond(int num) {
        int n = num -1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 0; i < num; i++){
            System.out.print("* ");
        }
        System.out.println();
    for (int i = n; i >=1; i--) {
        for (int j = 1; j <= n - i + 1; j++) {
            System.out.print(" ");
        }
        for(int k = 1; k <= i; k++){
            System.out.print("* ");
        }
        System.out.println();
    }
    }
}
