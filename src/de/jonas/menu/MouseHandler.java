package de.jonas.menu;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import de.jonas.music.PlayMusic;

public class MouseHandler implements MouseListener {

    private PlayMusic music = new PlayMusic();

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        music.onButtonHover();
        if (mouseEvent.getSource() == GUI.SETTINGS) {
            GUI.SETTINGS.setForeground(Color.BLACK);
            GUI.SETTINGS.setBackground(Color.WHITE);
        } else if (mouseEvent.getSource() == GUI.PLAY) {
            GUI.PLAY.setForeground(Color.BLACK);
            GUI.PLAY.setBackground(Color.WHITE);
        } else if (mouseEvent.getSource() == GUI.EXIT) {
            GUI.EXIT.setForeground(Color.BLACK);
            GUI.EXIT.setBackground(Color.WHITE);
        }
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        if (mouseEvent.getSource() == GUI.SETTINGS) {
            GUI.SETTINGS.setForeground(Color.WHITE);
            GUI.SETTINGS.setBackground(Color.BLACK);
        } else if (mouseEvent.getSource() == GUI.PLAY) {
            GUI.PLAY.setForeground(Color.WHITE);
            GUI.PLAY.setBackground(Color.BLACK);
        } else if (mouseEvent.getSource() == GUI.EXIT) {
            GUI.EXIT.setForeground(Color.WHITE);
            GUI.EXIT.setBackground(Color.BLACK);
        }
    }
}
