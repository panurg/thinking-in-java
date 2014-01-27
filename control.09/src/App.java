public class App {
    private static void printFibonacci(int x) {
        if (x < 2)
            return;
        int a = 1;
        int b = 1;
        System.out.print("1 1");
        for (int i = 2; i < x; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(" " + b);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int count = 0;

        if (args.length == 1)
            count = Integer.parseInt(args[0]);
        if (count > 1)
            printFibonacci(count);
        else
            System.out.println("Incorrect count entered");
    }
}
