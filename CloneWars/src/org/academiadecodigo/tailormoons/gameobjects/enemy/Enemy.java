package org.academiadecodigo.tailormoons.gameobjects.enemy;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.tailormoons.gameobjects.Crashable;
import org.academiadecodigo.tailormoons.gameobjects.GameObject;
import org.academiadecodigo.tailormoons.gameobjects.Shootable;

public abstract class Enemy extends GameObject implements Shootable, Crashable {

    private int health;
    private int scoreValue;
    private Picture picture;

    public Enemy(int health, int scoreValue, Picture picture) {
        super(picture);
        this.health = health;
        this.scoreValue = scoreValue;
    }

    @Override
    public void move() {

    }

    public boolean isDestroyed() {
        return this.health <= 0;
    }

}
