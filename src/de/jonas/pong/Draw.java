package de.jonas.pong;

import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Draw extends JLabel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());

        g.setColor(new Color(155, 245, 66));
        int top = 5;
        for (int i = 0; i < 16; i++) {
            g.fillRect(this.getWidth() / 2 - 10, top, 35, 35);
            top += 50;
        }

        g.setColor(Color.WHITE);
        g.fillRect(Variablen.playerX, Variablen.playerY, 40, 200);
        g.fillRect(Variablen.botX, Variablen.botY, 40, 200);

        g.fillRect(Variablen.ballX, Variablen.ballY, 20, 20);

        g.setFont(Variablen.pixelFont);

        g.drawString("" + Variablen.playerPoints, 400, 100);
        g.drawString("" + Variablen.botPoints, 600, 100);

        repaint();
    }

}
