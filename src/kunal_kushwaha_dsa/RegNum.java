//package kunal_kushwaha_dsa;
//
//import java.util.Scanner;
//
//public class RegNum {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter reg no: ");
//
//        String regNo = sc.next();
//        int len = regNo.length();
//        try {
//            if(len < 9 || len > 10){
//                ValidateInput validateInput = new ValidateInput("Reg Num should be either 9 or 10 char's");
//                throw validateInput;
//            }
//        } catch (ValidateInput e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}
