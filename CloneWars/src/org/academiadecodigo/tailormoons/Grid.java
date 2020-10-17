package org.academiadecodigo.tailormoons;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Grid {

    private final int WIDTH = 400;
    private final int HEIGHT = 800;
    private final int PADDING = 10;
    private Rectangle grid;

    public Grid() {
        grid = new Rectangle(PADDING, PADDING, WIDTH, HEIGHT);
        grid.setColor(Color.BLACK);
        grid.draw();
    }
}