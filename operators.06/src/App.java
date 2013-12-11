class Dog {
    String name, says;
}

public class App {
    public static void main(String[] args) {
        Dog spot = new Dog();
        spot.name = "spot"; spot.says = "Ruff!";
        Dog scruffy = new Dog();
        scruffy.name = "scruffy"; scruffy.says = "Wurf!";
        System.out.println(spot.name + " says: \"" + spot.says + "\"");
        System.out.println(scruffy.name + " says: \"" + scruffy.says + "\"");

        Dog dog = spot;
        System.out.println("dog == spot: " + (dog == spot));
        System.out.println("dog == scruffy: " + (dog == scruffy));
        System.out.println("dog.equals(spot): " + dog.equals(spot));
        System.out.println("dog.equals(scruffy): " + dog.equals(scruffy));
    }
}
