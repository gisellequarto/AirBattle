package org.academiadecodigo.tailormoons;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Grid {

    public static final int WIDTH = 400;
    public static final int HEIGHT = 800;
    private final int PADDING = 10;
    private Rectangle grid;
    private Picture background;

    public Grid() {
        grid = new Rectangle(PADDING, PADDING, WIDTH, HEIGHT + 30);
        grid.setColor(Color.BLACK);
        grid.draw();
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
