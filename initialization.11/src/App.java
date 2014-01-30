class Example {
    protected void finalize() {
        System.out.println("*finalize* is called");
    }
}

public class App {
    public static void main(String[] args) {
        Example example = new Example();
        new Example();
        System.gc();
        System.gc();
        /* System.out.println(); */
    }
}

