package org.academiadecodigo.tailormoons;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GridMenu {
    private final int PADDING = 10;
    private Picture background;
    private Game game;

    public GridMenu(Game game) {
        background = new Picture(PADDING, PADDING, "CloneWars/assets/start.png");
        this.game = game;
        background.draw();
    }

    public void delete() throws InterruptedException {
        background.delete();
        game.init("Hugo");
    }
}