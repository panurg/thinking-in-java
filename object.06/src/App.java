public class App {
    int storage(String s) {
        return s.length() * 2;
    }
    public static void main(String[] args) {
        App a = new App();
        String test = "test";
        System.out.println("String \"" + test + "\" storage is: " 
                + a.storage(test));
    }
}
