package sts;

import java.util.*;

class Strings {
    public static void main(String[] args) {
        String s = "Dhoni";
        String s2 = "Dhoni";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = sc.nextLine();
        if(s == s2){
            System.out.println("Using == without sc : The String matched");
        }else{
            System.out.println("Using == without sc : The String not matched");
        }
        if(s == input){
            System.out.println("Using == : The String matched");
        }else{
            System.out.println("Using == : The String not matched");
        }

        if(s.equals(input)){
            System.out.println("Using equals : The String matched");
        }else{
            System.out.println("Using equals: The String not matched");
        }
    }
}