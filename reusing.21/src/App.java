class A {
    final void f() { System.out.println("A.f()"); }
}

class B extends A {
    // void f() { System.out.println("B.f()"); } // can't override final method
}

class C extends A {
    // @Override void f() { System.out.println("C.f()"); } // can't override
    // final method
}

public class App {
    public static void main(String[] args) {
        C c = new C();
        c.f();
        B b = new B();
        b.f();
        A a = new A();
        a.f();
    }
}
