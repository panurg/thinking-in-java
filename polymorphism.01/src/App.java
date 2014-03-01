class Cycle {
    public void move() { System.out.println("Cycle.move()"); }
}

class Unicycle extends Cycle {
    @Override public void move() { System.out.println("Unicycle.move()"); }
}

class Bicycle extends Cycle {
    @Override public void move() { System.out.println("Bicycle.move()"); }
}

class Tricycle extends Cycle {
    @Override public void move() { System.out.println("Tricycle.move()"); }
}

public class App {
    static void ride(Cycle c) { c.move(); }
    public static void main(String[] args) {
        ride(new Unicycle());
        ride(new Bicycle());
        ride(new Tricycle());
    }
}
