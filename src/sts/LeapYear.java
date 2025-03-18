package sts;

public class LeapYear {
    public static void main(String[] args) {
       System.out.println(isLeapYear(2024));
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ) {
            return true;
        }
        return false;
    }
}
