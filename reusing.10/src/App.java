class Component1 {
    Component1(int i) { System.out.println("Component1(" + i + ")"); }
}

class Component2 {
    Component2(int i) { System.out.println("Component2(" + i + ")"); }
}

class Component3 {
    Component3(int i) { System.out.println("Component3(" + i + ")"); }
}

class Root {
    Component1 c1;
    Component2 c2;
    Component3 c3;
    Root(int i) {
        c1 = new Component1(i);
        c2 = new Component2(i);
        c3 = new Component3(i);
        System.out.println("Root(" + i + ")");
    }
}

class Stem extends Root {
    Component1 cs1;
    Component2 cs2;
    Component3 cs3;
    Stem(int i) {
        super(i + 1);
        cs1 = new Component1(i);
        cs2 = new Component2(i);
        cs3 = new Component3(i);
        System.out.println("Stem(" + i + ")");
    }
}

public class App {
    public static void main(String[] args) {
        new Stem(42);
    }
}

