class Amphibian {
    public void swim() { System.out.println("swim()"); move(); }
    public void move() { System.out.println("move()"); }
}

class Frog extends Amphibian {
}

public class App {
    public static void main(String[] args) {
        Frog f = new Frog();
        Amphibian a = f;
        a.swim();
    }
}
