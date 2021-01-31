package de.jonas.music;

import java.util.Timer;
import java.util.TimerTask;

import de.jonas.menu.Variablen;

public class PlayBackgroundMusic {

    Timer timer;
    public static CustomPlayer player = new CustomPlayer();

    public PlayBackgroundMusic() {
        player.setPath(getClass().getResource("/de/jonas/res/background.mp3"));
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (!Variablen.sound) {
                    return;
                }
                if (player.isRunning()) {
                    player.stop();
                    System.out.println("Stop running Custom-Player");
                }
                player.play(-1);
                System.out.println("Start new Custom-Player");
            }
        },0, 307800);
    }

}
