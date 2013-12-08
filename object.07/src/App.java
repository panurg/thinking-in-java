class StaticTest {
    static int i = 47;
}

class Incrementable {
    static void increment() { StaticTest.i++; }
}

public class App {
    public static void main(String[] args) {
        System.out.println("before: " + StaticTest.i);
        Incrementable.increment();
        System.out.println("after: " + StaticTest.i);
    }
}
