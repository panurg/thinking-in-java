class A {
    int a;
    public String toString() {
        return "A: " + a;
    }
}

public class App {
    final A a;
    App() {
        this(new A());
        a.a = 42;
    }

    App(A _a) {
        System.out.println("WTF??? " + this.a);
        a = _a;
        // funny, but here doesn't work
        // this.a = new A();
    }

    App(int x) {
        // can't use uninitialized final field
        // System.out.println(a);
        A a = new A();
        a.a = x;
        this.a = a;
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.a);
        A a = new A();
        a.a = 47;
        App app2 = new App(a);
        System.out.println(app2.a);
        App app3 = new App(28);
        System.out.println(app3.a);
    }
}
