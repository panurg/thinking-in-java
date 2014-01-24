import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 25; i++)
        {
            int a = random.nextInt();
            int b = random.nextInt();
            System.out.print("a = " + a + " b = " + b);
            if (a > b) {
                System.out.println(" a greater than b");
            }
            else if (a < b) {
                System.out.println(" a less than b");
            }
            else {
                System.out.println(" a equals b");
            }
        }
    }
}
