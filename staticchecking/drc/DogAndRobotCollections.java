//: staticchecking/drc/DogAndRobotCollections.java
package staticchecking.drc;
import java.util.*;

class Dog {
  public void talk() {
    System.out.println("Woof!");
  }
  public void reproduce() { }
}

class Robot {
  public void talk() {
    System.out.println("Click!");
  }
  public void oilChange() { }
}

public class DogAndRobotCollections {
  public static void main(String[] args) {
    List<Dog> dogList = new ArrayList<Dog>();
    List<Robot> robotList = new ArrayList<Robot>();
    for(int i = 0; i < 10; i++)
     dogList.add(new Dog());
    // dogList.add(new Robot()); // Compile-time error
    for(int i = 0; i < 10; i++)
     robotList.add(new Robot());
    // robotList.add(new Dog()); // Compile-time error
    for(Dog d : dogList)
     d.talk(); // No cast necessary
    for(Robot r: robotList)
     r.talk(); // No cast necessary
  }
} ///:~
