package org.academiadecodigo.tailormoons.gameobjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.tailormoons.Grid;
import org.academiadecodigo.tailormoons.gameobjects.enemy.Enemy;
import org.academiadecodigo.tailormoons.gameobjects.enemy.EnemyType;
import org.academiadecodigo.tailormoons.gameobjects.obstacle.Obstacle;
import org.academiadecodigo.tailormoons.gameobjects.obstacle.ObstacleType;

import java.util.LinkedList;
import java.util.List;

public abstract class GameObject {

    protected Picture picture;
    private String subtype;
    private static List<GameObject> recycledObjects = new LinkedList<>();
    private static List<GameObject> placedObjects = new LinkedList<>();


    public GameObject(Picture picture, String subtype) {
        this.picture = picture;
        this.subtype = subtype;
    }

    public int getX() {
        return picture.getX();
    }

    public int getY() {
        return picture.getY();
    }

    public abstract void move();

    public void place(int posX) {
        int yMove = 0;
        if (this.getY() != 0) {
            yMove = this.getY() > 0 ? -this.getY() : this.getY();
        }
        int xMove = 0;
        if (this.getX() != posX) {
            xMove = posX - this.getX();
        }
        this.picture.translate(xMove, yMove);
        recycledObjects.remove(this);
        placedObjects.add(this);
        this.picture.draw();
    }

    public void recycle() {
        placedObjects.remove(this);
        recycledObjects.add(this);
        picture.delete();
    }

    public static void placeObject(Class<? extends GameObject> type, String subtype, int posX, Grid grid) {
        for (GameObject gameObject : recycledObjects) {
            if (gameObject.getClass().equals(type) && gameObject.subtype == subtype) {
                gameObject.place(posX);
            }
        }
        if (Obstacle.class.equals(type)) {
            new Obstacle(ObstacleType.valueOf(subtype.toUpperCase()), grid).place(posX);
        } else if (Enemy.class.equals(type)) {
            new Enemy(EnemyType.valueOf(subtype.toUpperCase()), grid).place(posX);
        }
    }

    public static void moveAll() {
        for (GameObject object : new LinkedList<>(placedObjects)) {
            object.move();
        }
    }


}
