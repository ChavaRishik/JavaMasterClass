package oops.master.challenge;

public class Main {
    public static void main(String[] args) {
        Meal meal = new Meal();
        double bill = meal.Bill();
        String details = meal.toString();
        System.out.println(details);
        System.out.println(bill);
    }
}
