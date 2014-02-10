class Component1 {
    Component1() { System.out.println("Component1()"); }
    void dispose() { System.out.println("disposing Component1"); }
}

class Component2 {
    Component2() { System.out.println("Component2()"); }
    void dispose() { System.out.println("disposing Component2"); }
}

class Component3 {
    Component3() { System.out.println("Component3()"); }
    void dispose() { System.out.println("disposing Component3"); }
}

class Root {
    Component1 c1;
    Component2 c2;
    Component3 c3;
    Root() {
        c1 = new Component1();
        c2 = new Component2();
        c3 = new Component3();
        System.out.println("Root()");
    }
    void dispose() {
        System.out.println("disposing Root");
        c1.dispose();
        c2.dispose();
        c3.dispose();
    }
}

class Stem extends Root {
    Component1 cs1;
    Component2 cs2;
    Component3 cs3;
    Stem() {
        cs1 = new Component1();
        cs2 = new Component2();
        cs3 = new Component3();
        System.out.println("Stem()");
    }
    void dispose() {
        System.out.println("disposing Stem");
        cs1.dispose();
        cs2.dispose();
        cs3.dispose();
        super.dispose();
    }
}

public class App {
    public static void main(String[] args) {
        Stem s = new Stem();
        try {
            // to do smth
        }
        finally {
            s.dispose();
        }
    }
}
