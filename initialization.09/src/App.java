public class App {
    int x = 0;

    App(int x) {
        this.x = x;
    }

    App() {
        this(42);
    }

    public void printInfo() {
        System.out.println("x = " + x);
    }

    public static void main(String[] args) {
        App a = new App();
        a.printInfo();
    }
}
