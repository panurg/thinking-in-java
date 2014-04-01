/*
 * (3) Modify Exercise 9 so that it demonstrates the order of initialization of
 * the base classes and derived classes. Now add member objects to both the base
 * and derived classes and show the order in which their initialization occurs
 * during construction.
 */
class Tail {
    Tail() { System.out.println("Tail()"); }
}

class Mustache {
    Mustache() { System.out.println("Mustache()"); }
}

class Wool {
    Wool(String color) { System.out.println("Wool(): " + color); }
}

class Rodent {
    Tail t = new Tail();
    Mustache m = new Mustache();
    Rodent() { System.out.println("Rodent()"); }
    void move() {}
}

class Mouse extends Rodent {
    Wool w = new Wool("gray");
    Mouse() { System.out.println("Mouse()"); }
    @Override void move() { System.out.println("Mouse.move()"); }
}

class Gerbil extends Rodent {
    Wool w = new Wool("brown");
    Gerbil() { System.out.println("Gerbil()"); }
    @Override void move() { System.out.println("Gerbil.move()"); }
}

class Hamster extends Rodent {
    Wool w = new Wool("white");
    Hamster() { System.out.println("Hamster()"); }
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
