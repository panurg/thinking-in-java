/*
 * (4) Modify Exercise 12 so that one of the member objects is a shared object
 * with reference counting, and demonstrate that it works properly.
 */
class Tail {
    private int refcount = 0;
    public void addRef() { refcount++; }
    public void dispose() {
        if (refcount > 0)
            refcount--;
        if (refcount == 0)
            System.out.println("Tail disposed");
    }
    Tail() { System.out.println("Tail()"); }
}

class Mustache {
    Mustache() { System.out.println("Mustache()"); }
}

class Wool {
    Wool(String color) { System.out.println("Wool(): " + color); }
}

class Rodent {
    Tail t = null;
    Mustache m = new Mustache();
    Rodent(Tail tail) {
        t = tail;
        t.addRef();
        System.out.println("Rodent()"); 
    }
    void move() {}
    void die() { t.dispose(); }
}

class Mouse extends Rodent {
    Wool w = new Wool("gray");
    Mouse(Tail t) {
        super(t);
        System.out.println("Mouse()");
    }
    @Override void move() { System.out.println("Mouse.move()"); }
}

class Gerbil extends Rodent {
    Wool w = new Wool("brown");
    Gerbil(Tail t) {
        super(t);
        System.out.println("Gerbil()");
    }
    @Override void move() { System.out.println("Gerbil.move()"); }
}

class Hamster extends Rodent {
    Wool w = new Wool("white");
    Hamster(Tail t) {
        super(t);
        System.out.println("Hamster()");
    }
    @Override void move() { System.out.println("Hamster.move()"); }
}

public class App {
    public static void main(String[] args) {
        Tail t = new Tail();
        Rodent[] cage = { new Mouse(t),
            new Gerbil(t),
            new Hamster(t)
        };
        for (Rodent r : cage) {
            r.move();
            r.die();
        }
    }
}
