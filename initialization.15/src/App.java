class StringContainer {
    String s1;
    {
        s1 = "s1";
        System.out.println("initialization completed");
    }
}

public class App {
    public static void main(String[] args) {
        System.out.println("Begin");
        System.out.println("String container.s1: " + new StringContainer().s1);
        System.out.println("End");
    }
}
