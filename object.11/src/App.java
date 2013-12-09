class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors;
    void changeTheHueOfTheColor(int newHue) {
        anIntegerRepresentingColors = newHue;
    }
    // ...
}

public class App {
    public static void main(String[] args) {
        AllTheColorsOfTheRainbow color = new AllTheColorsOfTheRainbow();
        System.out.println("color = " + color.anIntegerRepresentingColors);
        color.changeTheHueOfTheColor(7);
        System.out.println("new color = " + color.anIntegerRepresentingColors);
    }
}
