package org.academiadecodigo.tailormoons.gameobjects.supply;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.tailormoons.Grid;
import org.academiadecodigo.tailormoons.gameobjects.GameObject;
import org.academiadecodigo.tailormoons.gameobjects.Shootable;

public class Supply extends GameObject implements Shootable {

    private boolean isCaught;
    private int scoreValue;
    private int speed;
    private Grid grid;

    public Supply(SupplyType supplyType, int x) {
        super(new Picture(x,0,supplyType.getPicturePath()), supplyType.name());
        this.scoreValue = supplyType.getScoreValue();
        this.speed = supplyType.getSpeed();
    }

    @Override
    public void move() {
        picture.translate(0, speed);
    }

    public int destroy() {
        this.recycle();
        return scoreValue;
    }

}
