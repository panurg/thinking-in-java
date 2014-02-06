class Base {
    Base(int i) { System.out.println("Base(" + i + ")"); }
}

public class App extends Base {
    App() { super(0); }
    App(int i) {super(i); }
    public static void main(String[] args) {
        new App();
        new App(42);
    }
}
