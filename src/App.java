import com.oc.cardgame.controller.GameController;
import com.oc.cardgame.model.Deck;
import com.oc.cardgame.view.View;


public class App {
    public static void main(String[] args) {
        GameController gc = new GameController(new View(), new Deck());
        gc.run();
    }
}
