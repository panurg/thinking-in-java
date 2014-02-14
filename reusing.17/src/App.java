class Amphibian {
    public void swim() { System.out.println("swim()"); move(); }
    public void move() { System.out.println("move()"); }
}

class Frog extends Amphibian {
    @Override public void move() { System.out.println("frog move()"); }
    public void croak() { System.out.println("CROAAAA!"); }
}

public class App {
    public static void main(String[] args) {
        Frog f = new Frog();
        f.croak();
        Amphibian a = f;
        a.swim();
    }
}
