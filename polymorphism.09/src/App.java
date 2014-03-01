class Rodent {
    void move() {}
}

class Mouse extends Rodent {
    @Override void move() { System.out.println("Mouse.move()"); }
}

class Gerbil extends Rodent {
    @Override void move() { System.out.println("Gerbil.move()"); }
}

class Hamster extends Rodent {
    @Override void move() { System.out.println("Hamster.move()"); }
}

public class App {
    public static void main(String[] args) {
        Rodent[] cage = { new Mouse(),
            new Gerbil(),
            new Hamster()
        };
        for (Rodent r : cage) {
            r.move();
        }
    }
}
