public class App {
    public static void main(String[] args) {
        int n = 0x80000000;
        for (int i = 0; i < 32; i++) {
            System.out.println("i = " + i + "\tn = " + Integer.toBinaryString(n));
            n >>= 1;
        }
    }
}
