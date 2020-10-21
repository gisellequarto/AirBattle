package org.academiadecodigo.tailormoons.gameobjects.enemy;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.tailormoons.Grid;
import org.academiadecodigo.tailormoons.gameobjects.Crashable;
import org.academiadecodigo.tailormoons.gameobjects.GameObject;
import org.academiadecodigo.tailormoons.gameobjects.Shootable;

public class Enemy extends GameObject implements Shootable, Crashable {

    EnemyType type;

    public Enemy(EnemyType enemyType, int x) {
        super(new Picture(x,30,enemyType.getPicturePath()));
        type = enemyType;
    }

    @Override
    public void move() {
        picture.translate(0, type.getSpeed());

        if (picture.getMaxY() >= Grid.HEIGHT) {
            this.recycle();
        }
    }

    public int destroy() {
        this.recycle();
        return type.getScoreValue();
    }

    public boolean isDestroyed() {
        return type.getHealth() <= 0;
    }

}
