/*
 * (2) Add a RectangularGlyph to PolyConstructors.java and demonstrate the
 * problem described in this section.
 */
import static net.mindview.util.Print.*;

class Glyph {
    void draw() { print("Glyph.draw()"); }
    Glyph() {
        print("Glyph() before draw()");
        draw();
        print("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int r) {
        radius = r;
        print("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw() {
        print("RoundGlyph.draw(), radius = " + radius);
    }
}

class RectangularGlyph extends Glyph {
    private int a = 2,
            b = 3;
    RectangularGlyph(int x, int y) {
        a = x;
        b = y;
        print("RectangularGlyph.RectangularGlyph(), a = " + a + ", b = " + b);
    }
    void draw() {
        print("RectangularGlyph.draw(), a = " + a + ", b = " + b);
    }
}
public class PolyConstructors {
    public static void main(String[] args) {
            new RoundGlyph(5);
            new RectangularGlyph(42, 47);
    }
}

