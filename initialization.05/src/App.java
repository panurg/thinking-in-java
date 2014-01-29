class Dog {
    public void bark(char x) {
        System.out.println("barking char: " + x);
    }

    public void bark(byte x) {
        System.out.println("barking byte: " + x);
    }

    public void bark(short x) {
        System.out.println("barking short: " + x);
    }

    public void bark(int x) {
        System.out.println("barking int: " + x);
    }

    public void bark(long x) {
        System.out.println("barking long: " + x);
    }

    public void bark(float x) {
        System.out.println("barking float: " + x);
    }

    public void bark(double x) {
        System.out.println("barking double: " + x);
    }
}

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.bark('a');
        dog.bark((byte)0);
        dog.bark((short)1);
        dog.bark(2);
        dog.bark(3L);
        dog.bark(5.f);
        dog.bark(6.);
    }
}
