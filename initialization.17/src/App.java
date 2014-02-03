class Test {
    Test(String arg) {
        System.out.println("arg is: " + arg);
    }
}

public class App {
    public static void main(String[] args) {
        Test[] test = new Test[42];
    }
}
