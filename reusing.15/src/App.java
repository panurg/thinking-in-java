import abcdef.*;

class B extends A {
    public void callF() { f(); }
}

public class App {
    public static void main(String[] args) {
        A a = new A();
        // not legit!
        // A.f();
        B b = new B();
        b.callF();
    }
}
