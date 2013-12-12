import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        boolean coinSide = random.nextBoolean();
        String result = null;
        if (coinSide) {
            result = "Head";
        }
        else {
            result = "Tail";
        }
        System.out.println("Result is: " + result);
    }
}
