package org.academiadecodigo.tailormoons;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Grid {

    public static final int WIDTH = 401;
    public static final int HEIGHT = 801;
    private final int PADDING = 10;
    private Rectangle grid;
    private Picture background;
    private Rectangle statusRectangle;

    public Grid() {
        grid = new Rectangle(PADDING, PADDING, WIDTH, HEIGHT+30);
        grid.setColor(Color.BLACK);
        grid.draw();
        statusRectangle = new Rectangle(PADDING, PADDING, WIDTH, 30);
        statusRectangle.setColor(Color.BLACK);
        statusRectangle.fill();
        background = new Picture(PADDING + 1, PADDING + 30, "CloneWars/assets/background1.png");
        background.draw();

    }

    public int getHeight() {
        return HEIGHT;
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public int getPADDING() {
        return PADDING;
    }
}