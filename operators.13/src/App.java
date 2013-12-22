public class App {
    public static void main(String[] args) {
        printChar("a", 'a');
        printChar("x", 'x');
    }

    static public void printChar(String msg, char c) {
        System.out.println(msg + ", " + "char c = \'" + c + "\' bin: " +
                Integer.toBinaryString(c));
    }
}
