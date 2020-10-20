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

    public Enemy(EnemyType enemyType, int x) {
        super(new Picture(x,0,enemyType.getPicturePath()), enemyType.name());
        this.health = enemyType.getHealth();
        this.scoreValue = enemyType.getScoreValue();
        this.speed = enemyType.getSpeed();
    }

    @Override
    public void move() {
        picture.translate(0, speed);
    }

    public int destroy() {
        this.recycle();
        return scoreValue;
    }

    public boolean isDestroyed() {
        return this.health <= 0;
    }

}
