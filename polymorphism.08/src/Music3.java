// package polymorphism.music3;
// import polymorphism.music.Note;
import static net.mindview.util.Print.*;

import java.util.Random;
enum Note {
    MIDDLE_C, C_SHARP, B_FLAT; // Etc.
}

class Instrument {
    void play(Note n) { print("Instrument.play() " + n); }
    public String toString() { return "Instrument"; }
    void adjust() { print("Adjusting Instrument"); }
}

class Wind extends Instrument {
    void play(Note n) { print("Wind.play() " + n); }
    public String toString() { return "Wind"; }
    void adjust() { print("Adjusting Wind"); }
}

class Percussion extends Instrument {
    void play(Note n) { print("Percussion.play() " + n); }
    public String toString() { return "Percussion"; }
    void adjust() { print("Adjusting Percussion"); }
}

class Stringed extends Instrument {
    void play(Note n) { print("Stringed.play() " + n); }
    public String toString() { return "Stringed"; }
    void adjust() { print("Adjusting Stringed"); }
}

class Brass extends Wind {
    void play(Note n) { print("Brass.play() " + n); }
    void adjust() { print("Adjusting Brass"); }
}

class Woodwind extends Wind {
    void play(Note n) { print("Woodwind.play() " + n); }
    public String toString() { return "Woodwind"; }
}

class Domra extends Stringed {
    void play(Note n) { print("Domra.play() " + n); }
    public String toString() { return "Domra"; }
    void adjust() {print("Adjusting Domra"); }
}

class MusicConservatory {
    Random rand = new Random();
    public Instrument graduateNext() {
        switch (rand.nextInt(6)) {
            default:
            case 0: return new Wind();
            case 1: return new Percussion();
            case 2: return new Stringed();
            case 3: return new Brass();
            case 4: return new Woodwind();
            case 5: return new Domra();
        }
    }
}

public class Music3 {
    // Doesn’t care about type, so new types
    // added to the system still work right:
    public static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }
    public static void main(String[] args) {
        /* System.out.println("Instruments: " + new Wind() + " " + new Percussion() +
            " " + new Stringed() + " " + new Brass()  + " " + new Woodwind() +
            " " + new Domra()); */
        // Upcasting during addition to the array:
        MusicConservatory conservatory = new MusicConservatory();
        Instrument[] orchestra = new Instrument[10];
        for (int i = 0; i < orchestra.length; i++) {
            orchestra[i] = conservatory.graduateNext();
        }
        tuneAll(orchestra);
    }
}

