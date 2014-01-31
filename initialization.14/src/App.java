class StringContainer {
    static String s1 = "s1";
    static String s2;
    static {
        s2 = "s2";
    }

    static public void printStrings() {
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
    }
}

public class App {
    public static void main(String[] args) {
        StringContainer.printStrings();
    }
}
