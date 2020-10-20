package org.academiadecodigo.tailormoons.gameobjects;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.tailormoons.Grid;
import org.academiadecodigo.tailormoons.gameobjects.enemy.Enemy;
import org.academiadecodigo.tailormoons.gameobjects.enemy.EnemyType;
import org.academiadecodigo.tailormoons.gameobjects.obstacle.Obstacle;
import org.academiadecodigo.tailormoons.gameobjects.obstacle.ObstacleType;
import org.academiadecodigo.tailormoons.gameobjects.supply.Supply;
import org.academiadecodigo.tailormoons.gameobjects.supply.SupplyType;

import java.util.LinkedList;
import java.util.List;

public abstract class GameObject {

    protected Picture picture;
    private String subtype;

    public GameObject(Picture picture, String subtype) {
        this.picture = picture;
        this.subtype = subtype;
    }

    public Picture getPicture() {
        return picture;
    }

    public abstract void move();

    public void place() {
        this.picture.draw();
    }

    public void recycle() {
        picture.delete();
    }



}
