package de.jonas.pong;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == KeyEvent.VK_UP) {
            Variablen.moveDown = true;
            Variablen.moveUp = false;
        } else if (keyEvent.getKeyCode() == KeyEvent.VK_DOWN) {
            Variablen.moveUp = true;
            Variablen.moveDown = false;
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == KeyEvent.VK_UP || keyEvent.getKeyCode() == KeyEvent.VK_DOWN) {
            Variablen.moveDown = false;
            Variablen.moveUp = false;
        }
    }
}
