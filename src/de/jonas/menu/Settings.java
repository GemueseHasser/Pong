package de.jonas.menu;

import de.jonas.music.PlayBackgroundMusic;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;

public class Settings {

    public Settings() {
        new ImageLoader();
        JFrame frame = new JFrame("Settings");
        frame.setBounds(0, 0, 400, 432);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);

        JButton apply = new JButton("Speichern");
        apply.setBounds(75, 300, 250, 50);
        apply.setOpaque(true);
        apply.setForeground(Color.WHITE);
        apply.setBackground(Color.GRAY);
        apply.addActionListener(actionEvent -> frame.dispose());

        ImageIcon speakerOn = new ImageIcon(ImageLoader.speakerOn);
        ImageIcon speakerOff = new ImageIcon(ImageLoader.speakerOff);

        JButton sound = new RoundButton("", 75, false);
        sound.setBounds(150, 140, 100, 100);
        sound.setIcon(speakerOn);
        sound.setBackground(Color.WHITE);
        sound.addActionListener(actionEvent -> {
            if (Variablen.sound) {
                Variablen.sound = false;
                sound.setIcon(speakerOff);
                PlayBackgroundMusic.player.pause();
            } else {
                Variablen.sound = true;
                sound.setIcon(speakerOn);
                PlayBackgroundMusic.player.restart();
            }
        });

        frame.add(apply);
        frame.add(sound);
        frame.setVisible(true);
    }

}
