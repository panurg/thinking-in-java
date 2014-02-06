class Base {
    Base() { System.out.println("Base constructor"); }
}

public class App extends Base {
    public static void main(String[] args) {
        new App();
    }
}
