package de.jonas;

import de.jonas.menu.Settings;
import de.jonas.music.PlayBackgroundMusic;
import de.jonas.pong.BallMovement;
import de.jonas.pong.BotMovement;
import de.jonas.pong.CalculateCurrentDirection;
import de.jonas.pong.GUI;
import de.jonas.pong.PlayerMovement;
import de.jonas.pong.Variablen;

public class Game {

    public static void main(String[] args) {
        new de.jonas.menu.Variablen();
        new de.jonas.menu.GUI();

        Settings.slider.setValue(1);

        new PlayBackgroundMusic();
    }

    public void startPong() {
        new GUI();
        new PlayerMovement();
        new BallMovement();
        new CalculateCurrentDirection();
        new BotMovement();
        new Variablen();
    }

}
