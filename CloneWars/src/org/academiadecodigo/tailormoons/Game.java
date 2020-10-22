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

    private boolean isPlaying = false;
    private List<GameObject> inactiveObjectsList = new LinkedList<>();
    private List<GameObject> activeObjectsList = new LinkedList<>();
    private int[] initialPosition = {20, 150, 280};
    private CollisionDetector colisionDetector;
    private Player player;
    private LinkedList<Bullet> bulletsList = new LinkedList<>();
    private int counter;

    public Game() {
        createGameObjects();
    }

    public void play() {
        isPlaying = true;
    }

    public void menuInit() {
        GridMenu menu = new GridMenu(this);
        Keyboard keyboard = new Keyboard(new KeyboardListener(menu, this));
        KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_S);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(left);
    }

    public void init(String playerName) throws InterruptedException {
        menuInit();

        while (true) {
            Thread.sleep(10);
            if (isPlaying) {
                break;
            }
        }

        Grid grid1 = new Grid();
        player = new Player(playerName, grid1);
        SuperiorGrid superiorGrid = new SuperiorGrid(player);
        colisionDetector = new CollisionDetector(activeObjectsList, inactiveObjectsList, bulletsList);


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


        counter = 30;
        while (true) {
            play(superiorGrid);
        }
    }

    private void play(SuperiorGrid superiorGrid) throws InterruptedException {
        moveAll();
        player.getFuel().decrease();
        superiorGrid.actualScore();
        colisionDetector.check(player);
        Thread.sleep(100);
        if (counter-- == 0) {
            placeObject();
            counter = 30;
        }
    }






    private void createGameObjects() {
        inactiveObjectsList.add(new Enemy(EnemyType.SPACESHIP, getXRandom()));
        inactiveObjectsList.add(new Enemy(EnemyType.SPACESHIP, getXRandom()));
        inactiveObjectsList.add(new Enemy(EnemyType.PLANE, getXRandom()));
        inactiveObjectsList.add(new Enemy(EnemyType.PLANE, getXRandom()));
        inactiveObjectsList.add(new Enemy(EnemyType.SATELLITE, getXRandom()));
        inactiveObjectsList.add(new Enemy(EnemyType.SATELLITE, getXRandom()));
        inactiveObjectsList.add(new Enemy(EnemyType.UFO, getXRandom()));
        inactiveObjectsList.add(new Enemy(EnemyType.UFO, getXRandom()));
        inactiveObjectsList.add(new Supply(SupplyType.GAS_STATION, getXRandom()));
        inactiveObjectsList.add(new Supply(SupplyType.GAS_STATION, getXRandom()));
        inactiveObjectsList.add(new Supply(SupplyType.BEER, getXRandom()));
        inactiveObjectsList.add(new Supply(SupplyType.BEER, getXRandom()));
        inactiveObjectsList.add(new Obstacle(ObstacleType.MOUNTAIN, getXRandom()));
        inactiveObjectsList.add(new Obstacle(ObstacleType.HELIX, getXRandom()));
        inactiveObjectsList.add(new Obstacle(ObstacleType.BUILDING, getXRandom()));

    }

    private int getXRandom() {
        return initialPosition[((int) (Math.random() * initialPosition.length))];
    }

    private void placeObject() {
        int random = ((int) (Math.random() * inactiveObjectsList.size()));
        inactiveObjectsList.get(random).place();
        activeObjectsList.add(inactiveObjectsList.remove(random));
    }

    public void moveAll() {
        for (GameObject g : activeObjectsList) {
            g.move();
        }
        if (player.canShoot()) {
            boolean alreadyShot = false;
            for (Bullet b : bulletsList) {
                if (b.getCanReuse() && !alreadyShot) {
                    player.reShoot(b);
                    alreadyShot = true;
                    System.out.println("bala reciclada");
                    break;
                }
            }
            if (!alreadyShot) {
                bulletsList.add(player.shoot());
                System.out.println("primeira bala");
            }
        }
        if (!bulletsList.isEmpty()) {
            for (int i = 0; i < bulletsList.size(); i++) {
                if (bulletsList.get(i).getBullet().getY() != 0){
                    bulletsList.get(i).move();
                }

            }
        }
    }

}
