public class App {
    static boolean test(int testval, int begin, int end) {
        if(testval >= begin && testval <= end)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(test(10, 5, 15));
        System.out.println(test(5, 10, 15));
        System.out.println(test(10, 10, 15));
    }
}

