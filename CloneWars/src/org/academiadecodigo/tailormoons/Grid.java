package org.academiadecodigo.tailormoons;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.tailormoons.gameobjects.obstacle.Obstacle;
import org.academiadecodigo.tailormoons.gameobjects.obstacle.ObstacleType;

public class Grid {

    private final int WIDTH = 400;
    private final int HEIGHT = 800;
    private final int PADDING = 10;
    private Rectangle grid;
    private Picture background;

    public Grid() {
        grid = new Rectangle(PADDING, PADDING, WIDTH, HEIGHT);
        grid.setColor(Color.BLACK);
        grid.draw();
        background = new Picture(PADDING, PADDING, "CloneWars/assets/background1.png");
        background.draw();
    }

    public int getHeight() {
        return HEIGHT;
    }
}