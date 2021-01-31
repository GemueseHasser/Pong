package de.jonas.pong;

import java.util.Timer;
import java.util.TimerTask;

public class PlayerMovement {

    Timer timer;

    public PlayerMovement() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if (Variablen.playerY <= 5) {
                    Variablen.playerY++;
                    return;
                }

                if (Variablen.playerY >= 590) {
                    Variablen.playerY--;
                    return;
                }

                if (Variablen.moveUp) {
                    Variablen.playerY += 3;
                } else if (Variablen.moveDown) {
                    Variablen.playerY -= 3;
                }
            }
        }, 0, 5);
    }

}
