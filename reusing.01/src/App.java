class Simple {
    Simple() {
        System.out.println("Simple constructed");
    }
}

public class App {
    static Simple simple;
    public static void main(String[] args) {
        System.out.println("Program started...");
        if (simple == null) {
            simple = new Simple();
        }
    }
}
