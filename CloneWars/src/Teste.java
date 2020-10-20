import org.academiadecodigo.tailormoons.Game;
import org.academiadecodigo.tailormoons.Grid;
import org.academiadecodigo.tailormoons.gameobjects.GameObject;
import org.academiadecodigo.tailormoons.gameobjects.enemy.Enemy;
import org.academiadecodigo.tailormoons.gameobjects.enemy.EnemyType;
import org.academiadecodigo.tailormoons.gameobjects.supply.Supply;
import org.academiadecodigo.tailormoons.gameobjects.supply.SupplyType;

public class Teste {

    public static void main(String[] args) throws InterruptedException {

        Grid grid = new Grid();

        Game game = new Game();
        game.init("Hugo");

        int counter = 30;
        while (true) {
            GameObject.moveAll();
            Thread.sleep(100);
            if (counter-- == 0) {
                GameObject.placeObject(Supply.class, SupplyType.GAS_STATION.name(), 50, grid);
                counter = 30;
            }

        }


    }
}
