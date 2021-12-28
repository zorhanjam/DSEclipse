/**
 *  Import the LinkedList class
 *  https://www.w3schools.com/java/java_linkedlist.asp
 */
import java.util.LinkedList;

public class LinkedListMain {
  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
    
    System.out.println();
    cars.addFirst("Mazda");
    System.out.println(cars);
    
    System.out.println();
    cars.addLast("Honda");
    System.out.println(cars);
    
    System.out.println();
    cars.removeFirst();
    System.out.println(cars);
    
    System.out.println();
    cars.removeLast();
    System.out.println(cars);
    
    System.out.println();
    System.out.println(cars.getFirst());
    
    System.out.println();
    System.out.println(cars.getLast());
  }
}

