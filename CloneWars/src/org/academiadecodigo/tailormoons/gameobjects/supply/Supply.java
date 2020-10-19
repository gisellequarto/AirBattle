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

    public Supply(SupplyType supplyType, Grid grid) {
        super(new Picture(0,0,supplyType.getPicturePath()), supplyType.name());
        this.scoreValue = supplyType.getScoreValue();
        this.speed = supplyType.getSpeed();
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

}
