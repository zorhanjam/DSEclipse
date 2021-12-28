import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMain { 
  public static void main(String[] args) { 
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(33);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(34);
    myNumbers.add(8);
    myNumbers.add(12);

    Collections.sort(myNumbers);

    for (int i : myNumbers) {
      System.out.println(i);
    }
    System.out.println();
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    Collections.sort(cars);  // Sort cars
    for (String i : cars) {
      System.out.println(i);
    }
    System.out.println();
    cars.set(0, "Opel");
    System.out.println(cars);
    
    System.out.println();
    System.out.println(cars.get(0));
    
    System.out.println();
    for (int i = 0; i < cars.size(); i++) {
        System.out.println(cars.get(i));
    }
    cars.clear();
    System.out.println(cars);
  } 
}
