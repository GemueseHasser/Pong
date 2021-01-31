package de.jonas.pong;

import java.util.Timer;
import java.util.TimerTask;

import static de.jonas.pong.Variablen.ballX;
import static de.jonas.pong.Variablen.ballY;
import static de.jonas.pong.Variablen.directionX;
import static de.jonas.pong.Variablen.directionY;
import static de.jonas.pong.Variablen.playerPoints;
import static de.jonas.pong.Variablen.botPoints;
import static de.jonas.pong.Variablen.playerY;
import static de.jonas.pong.Variablen.botY;

import de.jonas.music.PlayMusic;

public class CalculateCurrentDirection {

    Timer timer;
    PlayMusic music = new PlayMusic();

    public CalculateCurrentDirection() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if (ballX <= 60 && (playerY <= ballY && (playerY + 220 >= ballY))) {
                    music.dropBall();
                    directionX = 1;
                    return;
                }

                if (ballX >= 920 && (botY <= ballY && (botY + 220 >= ballY))) {
                    music.dropBall();
                    directionX = -1;
                    return;
                }

                if (ballY >= 780) {
                    directionY = -1;
                    return;
                }

                if (ballY <= 0) {
                    directionY = 1;
                    return;
                }

                if (ballX <= 10) {
                    botPoints++;
                    System.out.println("Punkt für den Gegner! (Gegner: " + botPoints + " Punkte)");
                    ballX = 500;
                    ballY = 400;

                    directionX = 1;
                    directionY = -1;
                    return;
                }

                if (ballX >= 990) {
                    playerPoints++;
                    System.out.println("Punkt für den dich! (Player: " + playerPoints + " Punkte)");
                    ballX = 500;
                    ballY = 400;

                    directionX = -1;
                    directionY = 1;
                }

            }
        }, 0, 5);
    }

}
