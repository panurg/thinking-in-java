public class App {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 1 : System.out.println("1"); break;
                case 2 : System.out.println("2 w/o break");
                case 3 : System.out.println("3"); break;
                default : System.out.println("default");
            }
        }
    }
}
