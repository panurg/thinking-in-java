import connections.*;

public class App {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println("trying to get connection #" + i + ": " +
                    ConnectionManager.getConnection());
        }
    }
}
