package org.academiadecodigo.tailormoons;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.tailormoons.gameobjects.obstacle.Obstacle;
import org.academiadecodigo.tailormoons.gameobjects.obstacle.ObstacleType;

public class Grid {

    private final int WIDTH = 400;
    private final int HEIGHT = 800;
    private final int PADDING = 10;
    private Rectangle grid;

    public Grid() {
        grid = new Rectangle(PADDING, PADDING, WIDTH, HEIGHT);
        grid.setColor(Color.BLACK);
        grid.fill();
    }

    public int getHeight() {
        return HEIGHT;
    }
}