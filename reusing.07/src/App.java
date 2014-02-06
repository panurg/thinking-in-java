class A {
    A(int i) { System.out.println("A(" + i + ")"); }
}

class B {
    B(int i) { System.out.println("B(" + i + ")"); }
}

class C extends A {
    C() { super(0); b = new B(1); }
    B b;
}

public class App {
    public static void main(String[] args) {
        new C();
    }
}
