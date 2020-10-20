package org.academiadecodigo.tailormoons;

import org.academiadecodigo.simplegraphics.graphics.Movable;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;


public class KeyboardListener implements KeyboardHandler {

    private Player player;

    public KeyboardListener(Player player) {
        this.player = player;

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
                player.translate(-10, 0);
                break;
            case KeyboardEvent.KEY_RIGHT:
                player.translate(10, 0);
                break;
            case KeyboardEvent.KEY_SPACE:
                player.setCanShoot();
        }
    }

    @Override
    public void keyReleased(KeyboardEvent event) {

    }


}

