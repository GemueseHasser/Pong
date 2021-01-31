package de.jonas.pong;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Variablen {

    static int ballX = 500, ballY = 400;

    static int directionX = -1, directionY = 1;

    static int playerX = 20, playerY = 300;

    static int botX = 940, botY = 300;

    static int playerPoints = 0, botPoints = 0;

    static boolean moveUp = false, moveDown = false;

    static Font pixelFont;

    public Variablen() {

        URL url = getClass().getResource("/de/jonas/res/coders_crux.ttf");
        InputStream font = null;
        try {
            font = url.openStream();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            assert font != null;
            pixelFont = Font.createFont(Font.TRUETYPE_FONT, font).deriveFont(125f);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
    }

}
