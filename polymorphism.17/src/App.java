/*
 * (2) Using the Cycle hierarchy from Exercise 1, add a balance( ) method to
 * Unicycle and Bicycle, but not to Tricycle. Create instances of all three types
 * and upcast them to an array of Cycle. Try to call balance( ) on each element
 * of the array and observe the results. Downcast and call balance( ) and observe
 * what happens.
 */
class Cycle {
    public void move() { System.out.println("Cycle.move()"); }
}

class Unicycle extends Cycle {
    @Override public void move() { System.out.println("Unicycle.move()"); }
    public void balance() { System.out.println("Unicycle.balance()"); }
}

class Bicycle extends Cycle {
    @Override public void move() { System.out.println("Bicycle.move()"); }
    public void balance() { System.out.println("Bicycle.balance()"); }
}

class Tricycle extends Cycle {
    @Override public void move() { System.out.println("Tricycle.move()"); }
}

public class App {
    public static void main(String[] args) {
        Cycle[] veil = { new Unicycle(), new Bicycle(), new Tricycle() };
        for (Cycle cycle : veil) {
            ((Unicycle)cycle).balance();
        }
    }
}
