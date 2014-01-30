class Tank {
    boolean full = false;
    static int count = 0;
    int number;

    Tank() {
        number = ++count;
    }

    public void fill() {
        full = true;
    }
    public void empty() {
        full = false;
    }

    protected void finalize() {
        if (full)
            System.out.println("Error: tank #" + number + " is full");
    }
}

public class App {
    public static void main(String[] args) {
        Tank tank = new Tank(); // Tank #1
        System.gc(); // Should be OK
        new Tank(); // Tank #2
        System.gc(); // Should be OK
        new Tank().fill(); // Tank #3
        System.gc(); // Tank #3 error
        tank.fill();
        System.gc(); // Should be OK
        tank = null;
        System.gc(); // Tank #1 error
        System.gc(); // To be sure
    }
}
