class FloatContainer {
    float f;
}

public class App {
    public static void main(String[] args) {
        FloatContainer fc1 = new FloatContainer();
        FloatContainer fc2 = new FloatContainer();
        fc1.f = 0.12345f;
        fc2.f = 0.54321f;
        System.out.println("fc1.f = "+ fc1.f + " fc2.f = " + fc2.f);
        fc1 = fc2;
        System.out.println("fc1.f = "+ fc1.f + " fc2.f = " + fc2.f);
        fc1.f = 0.11111f;
        System.out.println("fc1.f = "+ fc1.f + " fc2.f = " + fc2.f);
    }
}
