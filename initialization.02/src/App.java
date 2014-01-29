public class App {
    String s1 = "hello";
    String s2;

    App() {
        System.out.println("Constructor");
        System.out.println("Fields:");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println();

        s2 = "world";
    }

    public static void main(String[] args) {
        App a = new App();
        System.out.println(a.s1 + " " + a.s2);
    }
}

