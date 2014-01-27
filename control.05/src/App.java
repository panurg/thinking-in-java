public class App {
    public static void printlnBinaryString(int x) {
        char[] array = new char[32];
        boolean truncate = true;
        for (int i = 32; i > 0; i--) {
            array[32 - i] = (x & (1 << i)) == 0 ? '0' : '1';
        }
        for (int i = 0; i < 32; i++) {
            if (!truncate) {
                System.out.print(array[i]);
            }
            else if (truncate && array[i] == '1') {
                truncate = false;
                System.out.print(array[i]);
            }
        }
        if (truncate) {
            System.out.print('0');
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a = 0xAAAAAAAA;
        int b = 0x55555555;
        System.out.print("a = "); printlnBinaryString(a);
        System.out.print("b = "); printlnBinaryString(b);
        System.out.print("a & b = "); printlnBinaryString(a & b);
        System.out.print("a | b = "); printlnBinaryString(a | b);
        System.out.print("a ^ b = "); printlnBinaryString(a ^ b);
        System.out.print("~a = "); printlnBinaryString(~a);
        System.out.print("~b = "); printlnBinaryString(~b);
    }
}
