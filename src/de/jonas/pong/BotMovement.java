package de.jonas.pong;

import java.util.Timer;
import java.util.TimerTask;

public class BotMovement {

    Timer timer;

    public BotMovement() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (Variablen.ballX < 500) {
                    return;
                }

                if (Variablen.botY <= 10) {
                    Variablen.botY++;
                    return;
                }

                if (Variablen.botY >= 590) {
                    Variablen.botY--;
                    return;
                }

                if (Variablen.ballY <= (Variablen.botY + 90)) {
                    Variablen.botY--;
                } else {
                    Variablen.botY++;
                }
            }
        }, 0, 2);
    }

}
