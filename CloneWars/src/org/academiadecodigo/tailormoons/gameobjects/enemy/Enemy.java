package org.academiadecodigo.tailormoons.gameobjects.enemy;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.tailormoons.Grid;
import org.academiadecodigo.tailormoons.gameobjects.Crashable;
import org.academiadecodigo.tailormoons.gameobjects.GameObject;
import org.academiadecodigo.tailormoons.gameobjects.Shootable;

public class Enemy extends GameObject implements Shootable, Crashable {

    private int health;
    private int scoreValue;
    private int speed;
    private Grid grid;

    public Enemy(EnemyType enemyType, Grid grid) {
        super(new Picture(0,0,enemyType.getPicturePath()), enemyType.name());
        this.health = enemyType.getHealth();
        this.scoreValue = enemyType.getScoreValue();
        this.speed = enemyType.getSpeed();
        this.grid = grid;
    }

    @Override
    public void move() {
        picture.translate(0, speed);

        if(this.getY() > grid.getHeight()) {
            this.recycle();
        }
    }

    public int destroy() {
        this.recycle();
        return scoreValue;
    }

    public boolean isDestroyed() {
        return this.health <= 0;
    }

}
