package org.academiadecodigo.tailormoons;

import org.academiadecodigo.tailormoons.gameobjects.GameObject;

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

            if (p.getPlane().getY() == gameObject.getPicture().getMaxY()) {

                int gameObjectMin = gameObject.getPicture().getMaxY();
                int gameObjectMax = gameObjectMin + gameObject.getPicture().getMaxX();
                int playerMin = p.getPlane().getX();
                int playerMax = p.getPlane().getMaxX();

                if ((playerMin >= gameObjectMin && playerMin <= gameObjectMax) || (playerMax >= gameObjectMin && playerMax <= gameObjectMax)) {
                    System.out.println("COLLISION");
                    gameObject.recycle();
                    continue;
                }

                System.out.println(" NOT COLLISION!");

            }


         /*   int bottomObjectPosition = gameObject.getX() ;
            int playerAbovePosition = p.getPlane().getX();
            boolean leftCollision = (playerAbovePosition == bottomObjectPosition || playerAbovePosition == bottomObjectPosition + 40 || playerAbovePosition == bottomObjectPosition + 80);
            boolean middleCollision = (playerAbovePosition + 50 == bottomObjectPosition || playerAbovePosition + 50 == bottomObjectPosition + 40 || playerAbovePosition + 50 == bottomObjectPosition + 80);
            boolean rightCollision = (playerAbovePosition + 100 == bottomObjectPosition || playerAbovePosition + 100 == bottomObjectPosition + 40 || playerAbovePosition + 100 == bottomObjectPosition + 80);




            if ((leftCollision || middleCollision || rightCollision) && (p.getPlane().getY() == gameObject.getY())) {
                System.out.println("colidiu!");
                p.die();
            }*/
        }

    }


}
