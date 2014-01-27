public class App {
    public static void main(String[] args) {
        int max = 1000;
        boolean prime = true;
        for (int i = 1; i < max; i++) {
            prime = true;
            for (int j = 2; j < i / 2 + 1; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println(i);
            }
        }
    }
}
