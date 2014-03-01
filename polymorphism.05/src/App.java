class Cycle {
    public void move() { System.out.println("Cycle.move()"); }
    public int wheels() { return 0; }
}

class Unicycle extends Cycle {
    @Override public void move() { System.out.println("Unicycle.move()"); }
    @Override public int wheels() { return 1; }
}

class Bicycle extends Cycle {
    @Override public void move() { System.out.println("Bicycle.move()"); }
    @Override public int wheels() { return 2; }
}

class Tricycle extends Cycle {
    @Override public void move() { System.out.println("Tricycle.move()"); }
    @Override public int wheels() { return 3; }
}

public class App {
    static void ride(Cycle c) {
        System.out.print("wheels: " + c.wheels() + " ");
        c.move();
    }
    public static void main(String[] args) {
        ride(new Unicycle());
        ride(new Bicycle());
        ride(new Tricycle());
    }
}
