package de.jonas.pong;

import javax.swing.BorderFactory;
import javax.swing.JFrame;

import java.awt.Color;

public class GUI {

    public GUI() {
        new CalculateSpeed();
        JFrame frame = new JFrame("Pong");
        frame.setBounds(0, 0, 1000, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setUndecorated(true);
        frame.addKeyListener(new KeyHandler());
        frame.getRootPane().setBorder(BorderFactory.createLineBorder(Color.BLUE, 3, true));

        Draw draw = new Draw();
        draw.setBounds(0, 0, frame.getWidth(), frame.getHeight());
        draw.setVisible(true);

        frame.add(draw);
        frame.setVisible(true);
    }

}
