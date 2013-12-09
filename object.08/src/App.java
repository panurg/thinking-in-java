class StaticContainer {
    static int x = 0;
}

public class App {
    public static void main(String[] args) {
        System.out.println("x = " + StaticContainer.x);
        StaticContainer sc1 = new StaticContainer();
        sc1.x = 1;
        System.out.println("x = " + StaticContainer.x);
        StaticContainer sc2 = new StaticContainer();
        sc2.x = 2;
        System.out.println("x = " + StaticContainer.x);
    }
}
