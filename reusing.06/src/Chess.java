import static net.mindview.util.Print.*;
class Game {
    Game(int i) {
            print("Game constructor");
    }
}
class BoardGame extends Game {
    BoardGame(int i) {
        // couldn't be ommit
        super(i);
        print("BoardGame constructor");
        // coudn't stay here
        // super(i);
    }
}
public class Chess extends BoardGame {
    Chess() {
        super(11);
        print("Chess constructor");
    }
    public static void main(String[] args) {
        Chess x = new Chess();
    }
}

