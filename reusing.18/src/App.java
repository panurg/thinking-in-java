public class App {
    static int x = 0;
    final int y = x++;
    final static int z = x++;
    public String toString() {
        return "x: " + x + " y: " + y + " z: " + z;
    }

    public static void main(String[] args) {
        App a = new App();
        System.out.println(a);
        App b = new App();
        System.out.println(b);
    }
}
