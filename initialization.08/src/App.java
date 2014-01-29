public class App {
    private void test(String msg) {
        System.out.println("test: " + msg);
    }

    public void performTests() {
        test("w/o *this* keyword");
        this.test("with *this* keyword");
    }

    public static void main(String[] args) {
        App a = new App();
        a.performTests();
    }
}
