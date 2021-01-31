package de.jonas.menu;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Variablen {

    public static int ballSpeed = 5;

    public static boolean sound = true;

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
            pixelFont = Font.createFont(Font.TRUETYPE_FONT, font).deriveFont(125f);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
    }

}
