import org.academiadecodigo.tailormoons.Grid;
import org.academiadecodigo.tailormoons.gameobjects.GameObject;
import org.academiadecodigo.tailormoons.gameobjects.enemy.Enemy;
import org.academiadecodigo.tailormoons.gameobjects.enemy.EnemyType;

public class Teste {

    public static void main(String[] args) throws InterruptedException {

        //Game.init("Hugo");


        Grid grid = new Grid();
        int counter = 30;
        while (true) {
            GameObject.moveAll();
            Thread.sleep(100);
            if (counter-- == 0) {
                GameObject.placeObject(Enemy.class, EnemyType.HELICOPTER.name(), 50, grid);
                counter = 30;
            }

        }


    }
}
