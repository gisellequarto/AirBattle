package org.academiadecodigo.tailormoons;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.tailormoons.gameobjects.GameObject;
import org.academiadecodigo.tailormoons.gameobjects.enemy.Enemy;
import org.academiadecodigo.tailormoons.gameobjects.enemy.EnemyType;
import org.academiadecodigo.tailormoons.gameobjects.obstacle.Obstacle;
import org.academiadecodigo.tailormoons.gameobjects.obstacle.ObstacleType;
import org.academiadecodigo.tailormoons.gameobjects.supply.Supply;
import org.academiadecodigo.tailormoons.gameobjects.supply.SupplyType;

import java.util.LinkedList;
import java.util.List;

public class Game {

    private List<GameObject> gameObjectsList = new LinkedList<>();
    private List<GameObject> activeObjectsList = new LinkedList<>();
    private int[] initialPosition = {20, 150, 280};
    private CollisionDetector colisionDetector;
    private Player player;
    private LinkedList<Bullet> bulletsList = new LinkedList<>();
    public Game() {
        createGameObjects();
    }


    public void init(String playerName) throws InterruptedException {

        Grid grid1 = new Grid();
        player = new Player(playerName, grid1);
        colisionDetector = new CollisionDetector(activeObjectsList);


        Keyboard keyboard = new Keyboard(new KeyboardListener(player));
        KeyboardEvent right = new KeyboardEvent();
        KeyboardEvent left = new KeyboardEvent();
        KeyboardEvent shoot = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_RIGHT);
        left.setKey(KeyboardEvent.KEY_LEFT);
        shoot.setKey(KeyboardEvent.KEY_SPACE);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        shoot.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(right);
        keyboard.addEventListener(left);
        keyboard.addEventListener(shoot);


        int counter = 30;
        while (true) {
            moveAll();
            colisionDetector.check(player);
            Thread.sleep(100);
            if (counter-- == 0) {
                placeObject();
                counter = 30;
            }

        }

    }


    private void createGameObjects() {
        gameObjectsList.add(new Enemy(EnemyType.SPACESHIP, getXRandom()));
        gameObjectsList.add(new Enemy(EnemyType.SPACESHIP, getXRandom()));
        gameObjectsList.add(new Enemy(EnemyType.PLANE, getXRandom()));
        gameObjectsList.add(new Enemy(EnemyType.PLANE, getXRandom()));
        gameObjectsList.add(new Enemy(EnemyType.SATELLITE, getXRandom()));
        gameObjectsList.add(new Enemy(EnemyType.SATELLITE, getXRandom()));
        gameObjectsList.add(new Enemy(EnemyType.UFO, getXRandom()));
        gameObjectsList.add(new Enemy(EnemyType.UFO, getXRandom()));
        gameObjectsList.add(new Supply(SupplyType.GAS_STATION, getXRandom()));
        gameObjectsList.add(new Supply(SupplyType.GAS_STATION, getXRandom()));
        gameObjectsList.add(new Supply(SupplyType.BEER, getXRandom()));
        gameObjectsList.add(new Supply(SupplyType.BEER, getXRandom()));
        gameObjectsList.add(new Obstacle(ObstacleType.MOUNTAIN, getXRandom()));
        gameObjectsList.add(new Obstacle(ObstacleType.HELIX, getXRandom()));
        gameObjectsList.add(new Obstacle(ObstacleType.BUILDING, getXRandom()));

    }

    private int getXRandom() {
        return initialPosition[((int) (Math.random() * initialPosition.length))];
    }

    private void placeObject() {
        int random = ((int) (Math.random() * gameObjectsList.size()));
        gameObjectsList.get(random).place();
        activeObjectsList.add(gameObjectsList.get(random));
    }


    public void moveAll() {
        for (GameObject g : activeObjectsList) {
            g.move();
        }
        if (player.canShoot()) {
            for(Bullet b : bulletsList){
                if (b.getCanReuse()){

                }
            }
            bulletsList.add(player.shoot());
        }
        if (!bulletsList.isEmpty()){
            for (int i = 0; i < bulletsList.size(); i++){
                bulletsList.get(i).move();
            }
        }
    }


}
