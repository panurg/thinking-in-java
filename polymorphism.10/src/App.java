class A {
    void f() { g(); }
    void g() { System.out.println("A.g()"); }
}

class B extends A {
    @Override void g() { System.out.println("B.g()"); }
}

public class App {
    public static void main(String[] args) {
        A a = new B();
        a.f();
    }
}
