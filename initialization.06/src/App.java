class Dog {
    public void bark(int a, double b) {
        System.out.println("barking int then double: " + a + " " + b);
    }

    public void bark(double a, int b) {
        System.out.println("barking double then int: " + a + " " + b);
    }
}

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark(1, 2.);
        dog.bark(2., 3);
        // doesn't work:
        // dog.bark(4, 5);
        // dog.bark(6., 7.);
    }
}
