final class A {}

// can't inherit A because it is private
// class B extends A {}

public class App {
    public static void main(String[] args) {
        new A();
    }
}
