package de.jonas.pong;

import de.jonas.menu.Variablen;

import java.time.Duration;
import java.time.Instant;
import java.util.Timer;
import java.util.TimerTask;

public class CalculateSpeed {

    private final Instant start;

    public CalculateSpeed() {
        start = Instant.now();
        final Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (getUntilYet() > 50000) {
                    Variablen.ballSpeed = 5;
                    return;
                }
                if (getUntilYet() > 40000) {
                    Variablen.ballSpeed = 4;
                    return;
                }
                if (getUntilYet() > 25000) {
                    Variablen.ballSpeed = 3;
                    return;
                }
                if (getUntilYet() > 10000) {
                    Variablen.ballSpeed = 2;
                    return;
                }
                if (getUntilYet() > 0) {
                    Variablen.ballSpeed = 1;
                }
            }
        }, 0, 1000);
    }

    private long getUntilYet() {
        return Duration.between(start, Instant.now()).toMillis();
    }

}
