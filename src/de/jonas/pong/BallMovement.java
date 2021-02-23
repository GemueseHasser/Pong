package de.jonas.pong;

import java.util.Timer;
import java.util.TimerTask;
import static de.jonas.pong.Variablen.ballX;
import static de.jonas.pong.Variablen.ballY;
import static de.jonas.pong.Variablen.directionX;
import static de.jonas.pong.Variablen.directionY;

public class BallMovement {

    Timer timer;

    public BallMovement() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                for (int i = 0; i < de.jonas.menu.Variablen.ballSpeed; i++) {
                    ballX += directionX;
                    ballY += directionY;
                }
            }
        }, 0, 5);
    }

}
