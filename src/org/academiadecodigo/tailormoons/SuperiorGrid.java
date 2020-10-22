package org.academiadecodigo.tailormoons;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;

public class SuperiorGrid {

    public static final int WIDTH = Grid.WIDTH;
    public static final int HEIGHT = 30;
    private final int PADDING = 10;
    private Rectangle superiorGrid;
    private Player player;
    private Text score;

    public SuperiorGrid(Player player) {
        this.player = player;
        superiorGrid = new Rectangle(PADDING, PADDING, WIDTH, HEIGHT);
        superiorGrid.setColor(Color.BLACK);
        superiorGrid.fill();

        Text fuelText = new Text(50, 16, "FUEL ");
        fuelText.setColor(Color.WHITE);
        fuelText.draw();
        score = new Text(180, 16, ("SCORE: " + player.getScore()));
        score.setColor(Color.WHITE);
        score.draw();

    }

    public void actualScore() {
        score.setText("SCORE: " + player.getScore());
    }




}
