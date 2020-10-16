package org.academiadecodigo.tailormoons;



public class Test {

    public static void main(String[] args) throws InterruptedException {

        Grid grid = new Grid();
        Bullet bullet = new Bullet(200, 750);
        while (true) {
            Thread.sleep(80);
            bullet.move();
        }

    }
}
