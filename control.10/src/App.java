public class App {
    public static void main(String[] args) {
        int[] digits = new int[4];
        for (int i = 1000; i < 10000; i++) {
            digits[0] = i / 1000;
            digits[1] = i % 1000 / 100;
            digits[2] = i % 100 / 10;
            digits[3] = i % 10;

test:
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (k == j)
                        continue;
                    for (int l = 0; l < 4; l++) {
                        if (l == j || l == k)
                            continue;
                        for (int m = 0; m < 4; m++) {
                            if (m == l || m == k || m == j)
                                continue;
                            if (i == (digits[j] * 10 + digits[k]) * (digits[l] * 10 + digits[m])) {
                                System.out.println("" + i + " = " + digits[j] + digits[k] + " * " + digits[l] + digits[m]);
                                break test;
                            }
                            break;
                        }
                    }
                }
            }
        }
    }
}
