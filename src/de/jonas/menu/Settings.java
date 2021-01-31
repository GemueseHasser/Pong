package de.jonas.menu;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;

import java.awt.Color;
import java.awt.Font;

import de.jonas.music.PlayBackgroundMusic;

public class Settings {

    public static JSlider slider = new JSlider();
    static JLabel label = new JLabel("Ballgeschwindigkeit: " + slider.getValue(), JLabel.CENTER);

    public Settings() {
        new ImageLoader();
        JFrame frame = new JFrame("Settings");
        frame.setBounds(0, 0, 400, 432);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);

        SettingsDraw draw = new SettingsDraw();
        draw.setBounds(0, 0, frame.getWidth(), frame.getHeight());
        draw.setVisible(true);

        label.setForeground(Color.BLACK);
        label.setBounds(0, 55, frame.getWidth(), 30);
        label.setFont(new Font("Arial", Font.BOLD, 17));

        slider.setBounds(15, 30, 350, 20);
        slider.setMaximum(5);
        slider.setMinimum(1);
        slider.addChangeListener(changeEvent -> {
            int value = slider.getValue();
            if (value == 1) {
                Variablen.ballSpeed = 5;
            } else if (value == 2) {
                Variablen.ballSpeed = 4;
            } else if (value == 3) {
                Variablen.ballSpeed = value;
            } else if (value == 4) {
                Variablen.ballSpeed = 2;
            } else if (value == 5) {
                Variablen.ballSpeed = 1;
            }
        });

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

        frame.add(slider);
        frame.add(label);
        frame.add(apply);
        frame.add(sound);
        frame.add(draw);
        frame.setVisible(true);
    }

}
