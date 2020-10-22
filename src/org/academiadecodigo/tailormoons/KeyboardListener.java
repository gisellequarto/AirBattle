package org.academiadecodigo.tailormoons;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;


public class KeyboardListener implements KeyboardHandler {

    private Player player;
    private GridMenu menu;
    private Game game;

    public KeyboardListener(Player player) {
        this.player = player;

    }

    public KeyboardListener(GridMenu menu, Game game) {
        this.menu = menu;
        this.game = game;
    }

    @Override
    public void keyPressed(KeyboardEvent event) {
        switch (event.getKey()) {
            case KeyboardEvent.KEY_UP:
                player.translate(0, -10);
                break;
            case KeyboardEvent.KEY_DOWN:
                player.translate(0, 10);
                break;
            case KeyboardEvent.KEY_LEFT:
                player.translate(-20, 0);
                break;
            case KeyboardEvent.KEY_RIGHT:
                player.translate(20, 0);
                break;
            case KeyboardEvent.KEY_SPACE:
                player.setCanShoot();
            case KeyboardEvent.KEY_S:
                if (game == null){
                    break;
                }
                game.play();
        }
    }

    @Override
    public void keyReleased(KeyboardEvent event) {

    }


}

