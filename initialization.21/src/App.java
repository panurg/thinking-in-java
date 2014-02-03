enum PaperCurrency {
    ONE, TWO, FIVE, TEN, FIFTY, ONE_HUNDRED,
}

public class App {
    public static void main(String[] args) {
        for (PaperCurrency pc : PaperCurrency.values())
            System.out.println("value: " + pc + " ordinal: " + pc.ordinal());
    }
}
