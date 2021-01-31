package de.jonas.menu;

import javax.imageio.ImageIO;

import java.awt.Image;
import java.io.IOException;

public class ImageLoader {

    static Image speakerOn, speakerOff;

    public ImageLoader() {
        try {
            speakerOn = ImageIO.read(getClass().getResource("/de/jonas/res/speakerOn.png"));
            speakerOff = ImageIO.read(getClass().getResource("/de/jonas/res/speakerOff.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
