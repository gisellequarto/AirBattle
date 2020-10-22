package org.academiadecodigo.tailormoons;

import org.academiadecodigo.tailormoons.gameobjects.GameObject;
import org.academiadecodigo.tailormoons.gameobjects.obstacle.Obstacle;
import org.academiadecodigo.tailormoons.gameobjects.supply.Supply;

import java.util.Iterator;
import java.util.List;

public class CollisionDetector {

    private List<GameObject> activeObjectList;
    private List<Bullet> bulletList;
    private List<GameObject> inactiveObjectList;

    public CollisionDetector(List<GameObject> gameObjectList, List<GameObject> inactiveObjectList, List<Bullet> bulletList) {
        this.activeObjectList = gameObjectList;
        this.bulletList = bulletList;
        this.inactiveObjectList = inactiveObjectList;
    }

    public boolean isUnSafe(Player p) {
        for (GameObject g : activeObjectList) {
            if (g.getPicture().getX() == p.getPlane().getX() && g.getPicture().getY() == p.getPlane().getY()) {
                return true;
            }
        }
        return false;
    }


    public void check(Player p) {

        Iterator<GameObject> iterator = activeObjectList.iterator();
        while (iterator.hasNext()) {
            GameObject gameObject = iterator.next();

            for (Bullet b : bulletList){
                if (b.getBullet().getY() == 0){
                    continue;
                }
                if (b.getBullet().getY() > gameObject.getPicture().getY() + 80){
                    continue;
                }
                if (b.getBullet().getX() > gameObject.getPicture().getX() + 80){
                    continue;
                }
                if (gameObject.getPicture().getX() > b.getBullet().getX() + 10){
                    continue;
                }
                if (gameObject instanceof Obstacle){
                    b.getBullet().delete();
                    b.getBullet().translate(0, -b.getBullet().getY());
                    b.setCanReuse(true);
                    break;
                }
                b.getBullet().delete();
                b.getBullet().translate(0, -b.getBullet().getY());
                b.setCanReuse(true);
                gameObject.getPicture().delete();
                inactiveObjectList.add(gameObject);
                iterator.remove();
                p.increaseScore(10);
                break;
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
