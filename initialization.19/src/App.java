public class App {
    public static void main(String[] args) {
        test("hello", ", ", "world");
        test(new String[]{"123", "abc"});
    }

    static void test(String... args) {
        for (String a : args)
            System.out.println(a);
        System.out.println();
    }
}
