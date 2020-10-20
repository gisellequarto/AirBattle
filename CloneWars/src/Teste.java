import org.academiadecodigo.tailormoons.Game;
import org.academiadecodigo.tailormoons.Grid;
import org.academiadecodigo.tailormoons.gameobjects.GameObject;
import org.academiadecodigo.tailormoons.gameobjects.enemy.Enemy;
import org.academiadecodigo.tailormoons.gameobjects.enemy.EnemyType;
import org.academiadecodigo.tailormoons.gameobjects.supply.Supply;
import org.academiadecodigo.tailormoons.gameobjects.supply.SupplyType;

public class Teste {

    public static void main(String[] args) throws InterruptedException {


        Game game = new Game();
        game.init("Hugo");

<<<<<<< HEAD
=======
        int counter = 30;
        while (true) {
            GameObject.moveAll();
            Thread.sleep(100);
            if (counter-- == 0) {
                GameObject.placeObject(Supply.class, SupplyType.GAS_STATION.name(), 50, grid);
                counter = 30;
            }
>>>>>>> 74a30f14141bce208b45f434f3ec8ab6fe65e81e



    }
}
