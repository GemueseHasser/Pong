package de.jonas.menu;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;

import de.jonas.Game;
import de.jonas.music.PlayMusic;

public class GUI {

    static JButton SETTINGS, PLAY, EXIT;

    public GUI() {

        PlayMusic music = new PlayMusic();
        music.onJoin();

        JFrame frame = new JFrame("Game-Menu - by Jonas");
        frame.setBounds(0, 0, 400, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setUndecorated(true);
        frame.getRootPane().setBorder(BorderFactory.createLineBorder(Color.WHITE));

        Draw draw = new Draw();
        draw.setBounds(0, 0, frame.getWidth(), frame.getHeight());
        draw.setVisible(true);

        JButton settings = new JButton("Settings");
        settings.setBounds(50, 200, 300, 50);
        settings.setOpaque(true);
        settings.setForeground(Color.WHITE);
        settings.setBackground(Color.BLACK);
        settings.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5, true));
        settings.setFocusable(false);
        settings.setFont(Variablen.pixelFont.deriveFont(50f));
        settings.addMouseListener(new MouseHandler());
        settings.addActionListener(actionEvent -> {
            music.onClick();
            new Settings();
        });

        JButton play = new JButton("Play");
        play.setBounds(50, 300, 300, 50);
        play.setOpaque(true);
        play.setForeground(Color.WHITE);
        play.setBackground(Color.BLACK);
        play.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5, true));
        play.setFocusable(false);
        play.setFont(Variablen.pixelFont.deriveFont(50f));
        play.addMouseListener(new MouseHandler());
        play.addActionListener(actionEvent -> {
            music.onClick();
            Game game = new Game();
            game.startPong();
            frame.dispose();
        });

        JButton exit = new JButton("Close");
        exit.setBounds(50, 400, 300, 50);
        exit.setOpaque(true);
        exit.setForeground(Color.WHITE);
        exit.setBackground(Color.BLACK);
        exit.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5, true));
        exit.setFocusable(false);
        exit.setFont(Variablen.pixelFont.deriveFont(50f));
        exit.addMouseListener(new MouseHandler());
        exit.addActionListener(actionEvent -> {
            music.onClick();
            System.exit(0);
        });

        SETTINGS = settings;
        PLAY = play;
        EXIT = exit;

        frame.add(settings);
        frame.add(play);
        frame.add(exit);
        frame.add(draw);
        frame.setVisible(true);
    }

}
