class A {
    private void f() { System.out.println("f()"); }
    private final void g() { System.out.println("g()"); }
    final void h() { System.out.println("h()"); }
    public void j() { System.out.println("j()"); }
    public void k() { System.out.println("k()"); }
}

class B extends A {
    // @Override // override isn't possible here because original method is private
    private void f() { System.out.println("ef()"); }
    // @Override // origianl method is private
    private void g() { System.out.println("eg()"); }
    // @Override // origianl method is final
    // void h() { System.out.println("eh()"); }
    @Override
    public void j() { System.out.println("ej()"); }
    public void k() { System.out.println("ek()"); }
}

public class App {
    public static void main(String[] args) {
        B b = new B();
        //b.f(); // can't call private merhod
        //b.g() // can't call private merhod;
        b.h();
        b.j();
        b.k();
        A a = b;
        //a.f(); // can't call private method
        //a.g(); // can't call private method
        a.h();
        a.j();
        b.k();
    }
}
