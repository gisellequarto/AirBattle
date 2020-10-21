package org.academiadecodigo.tailormoons.gameobjects.supply;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.tailormoons.Grid;
import org.academiadecodigo.tailormoons.gameobjects.GameObject;
import org.academiadecodigo.tailormoons.gameobjects.Shootable;

public class Supply extends GameObject implements Shootable {

    private boolean isCaught;
    private SupplyType type;

    public Supply(SupplyType supplyType, int x) {
        super(new Picture(x,30,supplyType.getPicturePath()));
        type = supplyType;
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

}
