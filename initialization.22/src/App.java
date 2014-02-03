enum PaperCurrency {
    ONE, TWO, FIVE, TEN, FIFTY, ONE_HUNDRED,
}

public class App {
    public static void main(String[] args) {
        switch (PaperCurrency.FIFTY) {
            case ONE:
            case TWO:
                System.out.println("Nothing at all");
                break;
            case FIVE:
            case TEN:
                System.out.println("Not so much");
                break;
            case FIFTY:
            case ONE_HUNDRED:
                System.out.println("You can buy some beer!");
                break;
            default:
                System.out.println("It is fake note");
                break;
        }
    }
}

