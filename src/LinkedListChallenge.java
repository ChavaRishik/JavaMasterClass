import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListChallenge {


   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       LinkedList<Place> placesToVisit = new LinkedList<>();

       Place kmm = new Place("Kmm", 120);
       Place vij = new Place("Vij", 120);
       addPlace(placesToVisit, kmm);
       addPlace(placesToVisit, vij);
       System.out.println(placesToVisit);
       boolean quit = false;
       var listIterator = placesToVisit.listIterator();
       while (!quit) {
           System.out.printf("Which Operations Would you like to perform?%n" +
                   "(F)orward%n" +
                   "(B)ackward%n" +
                   "(L)ist All Places%n" +
                   "(M)enu" +
                   "(Q)uit%n");
           String input = sc.nextLine();
           if (input.equals("Q")) {
               quit = true;
               break;
           } else if (input.equals("F")) {
               System.out.println(listIterator.next());

           } else if (input.equals("B")) {
               System.out.println(listIterator.previous());
           } else if (input.equals("L")) {

               while (listIterator.hasNext()) {
                   System.out.println(listIterator.next());
               }

           } else if (input.equals("M")) {

               System.out.println("Menu");

           }
       }








   }

   private static void addPlace(LinkedList<Place> placesToVisit, Place place) {
       if(placesToVisit.contains(place)) {
           System.out.println("Place already exists");
           return;
       }

       for(Place p : placesToVisit){
           if(p.getName().equalsIgnoreCase(place.getName())) {
               System.out.println("Place already exists");
               return;
           }
       }
           placesToVisit.add(place);

   }


}




























class Place{

    String name;
    int distance;
    public Place(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        System.out.printf("The place is %s with %d distance.%n", name, distance);
        return name;
    }
}
