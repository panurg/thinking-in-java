class Base {
    Base() { System.out.println("Base constructor"); }
}

class Derived extends Base {
    Derived() { System.out.println("Derived constructor"); }
}

public class App extends Derived {
    App() { System.out.println("App constructor"); }
    public static void main(String[] args) {
        new App();
    }
}

