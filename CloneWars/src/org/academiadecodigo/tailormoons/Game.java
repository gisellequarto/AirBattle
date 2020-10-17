package org.academiadecodigo.tailormoons;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;

public class Game {

    public static void init(String playerName){

        Grid grid1 = new Grid();
        Player player = new Player(playerName);

        Keyboard keyboard = new Keyboard(new KeyboardListener(player));
        KeyboardEvent right = new KeyboardEvent();
        KeyboardEvent left = new KeyboardEvent();
        KeyboardEvent shoot = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_RIGHT);
        left.setKey(KeyboardEvent.KEY_LEFT);
        shoot.setKey(KeyboardEvent.KEY_SPACE);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        shoot.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(right);
        keyboard.addEventListener(left);
        keyboard.addEventListener(shoot);
    }
}
