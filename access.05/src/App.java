import example.*;

public class App {
    public static void main(String[] args) {
        Test test = new Test();
        test.fieldPublic = 1;
        // Those field are not accessible outside the class (private), package
        // (protected and package) or inherited classes (protected)
        /* test.fieldPrivate = 2; */
        /* test.fieldProtected = 3; */
        /* test.fieldPackage = 4; */
    }
}
