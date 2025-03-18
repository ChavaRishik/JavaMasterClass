package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListChallenge {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter : 0 to exit");
        System.out.println("        1 - add items");
        System.out.println("        2 - remove items");
        int n = sc.nextInt();
        sc.nextLine();

        while(n!= 0){
            if( n == 1){
                System.out.println("Enter Items to the ArrayList Seperated by commas");
                String lines = sc.nextLine().trim();
                String[] values = lines.split(",");
                for(String value : values){
                    if(!arrayList.contains(value.trim())){
                        arrayList.add(value);
                    }
                }
                arrayList.sort(Comparator.naturalOrder());
                System.out.println(arrayList);
            } else if ( n == 2) {
                if(!arrayList.isEmpty()){
                    System.out.println("Enter Items to remove from the ArrayList Seperated by commas");
                    String[] values = sc.nextLine().trim().split(",");
                    arrayList.removeAll(Arrays.asList(values));
                }else {
                    System.out.println("The array list is empty");
                }

            }
            System.out.println("Enter : 0 to exit");
            System.out.println("        1 - add items");
            System.out.println("        2 - remove items");
            n= sc.nextInt();
            sc.nextLine();
        }
    }
}
