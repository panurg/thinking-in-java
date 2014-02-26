class A {
    static { System.out.println("A loaded"); }
    A() { System.out.println("A()"); }
}

class B {
    static { System.out.println("B loaded"); }
    B() { System.out.println("B()"); }
    static int i = 42;
}

public class App {
    App() { System.out.println("App()"); }
    static { System.out.println("App loaded"); }
    static int j = 0;
    public static void main(String[] args) {
        System.out.println("main(String[])");
        App.j++;
        new App();
        new A();
        B.i = j;
    }
}
