public class App {
    public static void stringTest(String x, String y) {
        // Relational and logical:
        /* System.out.println("x = \"" + x + "\" y = \"" + y + "x > y: " + (x > y)); */
        /* System.out.println("x = \"" + x + "\" y = \"" + y + "x >= y: " + (x >= y)); */
        /* System.out.println("x = \"" + x + "\" y = \"" + y + "x < y: " + (x < y)); */
        /* System.out.println("x = \"" + x + "\" y = \"" + y + "x <= y: " + (x <= y)); */
        System.out.println("x = \"" + x + "\" y = \"" + y + "\" x == y: " + (x == y));
        System.out.println("x = \"" + x + "\" y = \"" + y + "\" x != y: " + (x != y));
        System.out.println("x = \"" + x + "\" y = \"" + y + "\" x.equals(y): " + x.equals(y));
        //! f(!x);
        //! f(x && y);
        //! f(x || y);
    }

    public static void main(String[] args) {
        stringTest("a", new String("a"));
        stringTest("a", "a");
        stringTest("a", "b");
        stringTest("a", "abc");
    }
}
