class Test {
    protected int field = 42;
}

public class App {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println("Test's field: " + test.field);
        test.field = 0;
    }
}
