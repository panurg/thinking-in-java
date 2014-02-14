class A {
    public void f(int x) {
        System.out.println("int");
    }

    public void f(char x) {
        System.out.println("char");
    }

    public void f(float x) {
        System.out.println("float");
    }
}

class B extends A {
    public void f(double x) {
        System.out.println("double");
    }
}

public class App {
    public static void main(String[] args) {
        B b = new B();
        b.f(1);
        b.f('1');
        b.f(1.f);
        b.f(1.d);
    }
}
