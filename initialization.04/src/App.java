public class App {
    App() {
        System.out.println("hello world");
    }

    App(String msg) {
        System.out.println("hello world: " + msg);
    }

    public static void main(String[] args) {
        App a = new App();
        App b = new App("test");
    }
}

