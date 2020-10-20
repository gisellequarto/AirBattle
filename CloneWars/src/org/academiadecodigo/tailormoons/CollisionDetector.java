package org.academiadecodigo.tailormoons;

import org.academiadecodigo.tailormoons.gameobjects.GameObject;

import java.util.List;

public class CollisionDetector {

    private List<GameObject> list;

    public CollisionDetector(List<GameObject> list) {
        this.list = list;
    }

    public boolean isUnSafe(Player p) {
        for (GameObject g : list) {
            if (g.getPicture().getX() == p.getPlane().getX() && g.getPicture().getY() == p.getPlane().getY()) {
                return true;
            }
        }
        return false;
    }


    public void check(Player p) {

        for (GameObject gameObject : list) {

            if (p.getPlane().getY() == gameObject.getPicture().getMaxY()) {

                int gameObjectMin = gameObject.getPicture().getMaxY();
                int gameObjectMax = gameObjectMin + gameObject.getPicture().getMaxX();
                int playerMin = p.getPlane().getX();
                int playerMax = p.getPlane().getMaxX();

                if ((gameObjectMax < playerMin) || (gameObjectMin > playerMax)) {
                    System.out.println("NOT COLLISION");
                    continue;
                }

                gameObject.recycle();
                System.out.println("COLLISION!");

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
