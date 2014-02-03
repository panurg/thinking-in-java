class Test {
    Test(String arg) {
        System.out.println("arg is: " + arg);
    }
}

public class App {
    public static void main(String[] args) {
        Test[] test = new Test[42];
        for (int i = 0; i < 42; i++)
            test[i] = new Test("" + i);
    }
}

