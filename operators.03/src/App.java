class FloatContainer {
    float f;
}

public class App {
    static void func(FloatContainer fc) {
        fc.f = 0.42f;
    }

    public static void main(String[] args) {
        FloatContainer fcm = new FloatContainer();
        fcm.f = 0.666f;
        System.out.println("fcm.f = " + fcm.f);
        func(fcm);
        System.out.println("fcm.f = " + fcm.f);
    }
}
