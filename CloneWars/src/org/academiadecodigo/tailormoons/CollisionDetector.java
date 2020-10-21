package org.academiadecodigo.tailormoons;

import org.academiadecodigo.tailormoons.gameobjects.GameObject;
import org.academiadecodigo.tailormoons.gameobjects.supply.Supply;
import org.academiadecodigo.tailormoons.gameobjects.supply.SupplyType;

import java.util.List;

public class CollisionDetector {

    private List<GameObject> gameObjectList;
    private List<Bullet> bulletList;

    public CollisionDetector(List<GameObject> gameObjectList, List<Bullet> bulletList) {
        this.gameObjectList = gameObjectList;
        this.bulletList = bulletList;
    }

    public boolean isUnSafe(Player p) {
        for (GameObject g : gameObjectList) {
            if (g.getPicture().getX() == p.getPlane().getX() && g.getPicture().getY() == p.getPlane().getY()) {
                return true;
            }
        }
        return false;
    }


    public void check(Player p) {

        for (GameObject gameObject : gameObjectList) {

            for (Bullet b : bulletList){
                if (b.getBullet().getY() > gameObject.getPicture().getY() + 80){
                    continue;
                }
                if (b.getBullet().getX() > gameObject.getPicture().getX() + 80){
                    continue;
                }
                if (gameObject.getPicture().getX() > b.getBullet().getX() + 10){
                    continue;
                }
                b.getBullet().delete();
                b.getBullet().translate(0, -b.getBullet().getY());
                gameObject.getPicture().delete();
                gameObject.getPicture().translate(0, -1000);
                p.increaseScore(10);
            }

            if (gameObject.getPicture().getY() + 80 < p.getPlane().getY()){
                continue;
            }
            if (gameObject.getPicture().getX() + 80 < p.getPlane().getX()){
                continue;
            }
            if (p.getPlane().getX() + 100 < gameObject.getPicture().getX()){
                continue;
            }
            if (gameObject instanceof Supply){
                System.out.println("p.reFuel()");
                continue;
            }
            p.die();
            break;

        }



    }


}
