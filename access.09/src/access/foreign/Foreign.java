package access.foreign;
import access.local.*;
public class Foreign {
    public static void main(String[] args) {
        // Wouldn't compile because PackagedClass has only package access
        // PackagedClass pc = new PackagedClass();
    }
}

