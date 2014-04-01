/*
 * (3) Add a finalize( ) method to ReferenceCounting.java to verify the 
 * termination condition (see the Initialization & Cleanup chapter).
 */

import static net.mindview.util.Print.*;

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    public Shared() {
        print("Creating " + this);
    }
    public void addRef() { refcount++; }
    protected void dispose() {
        if(--refcount == 0)
            print("Disposing " + this);
    }
    public String toString() { return "Shared " + id; }
    protected void finalize() {
        if (refcount > 0)
            print("Shared: not all objects are disposed");
        else
            print("Shared: all objects are disposed");
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    public Composing(Shared shared) {
        print("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void dispose() {
        print("disposing " + this);
        shared.dispose();
    }
    public String toString() { return "Composing " + id; }
}

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = { new Composing(shared),
            new Composing(shared), new Composing(shared),
            new Composing(shared), new Composing(shared) };
        for(int i = 0; i < composing.length; i++) {
            /* composing[i].dispose(); */ // cause termination condition to fail
            composing[i] = null;
        }
        composing = null;
        shared = null;
        System.gc();
    }
}

