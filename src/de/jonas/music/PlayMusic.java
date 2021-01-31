package de.jonas.music;

public class PlayMusic {

    public static CustomPlayer player;

    public void onButtonHover() {
        player = new CustomPlayer();
        player.setPath(getClass().getResource("/de/jonas/res/onHoverButton.mp3"));
        player.play(-1);
    }

    public void onJoin() {
        player = new CustomPlayer();
        player.setPath(getClass().getResource("/de/jonas/res/onJoin.mp3"));
        player.play(-1);
    }

    public void onClick() {
        player = new CustomPlayer();
        player.setPath(getClass().getResource("/de/jonas/res/onClick.mp3"));
        player.play(-1);
    }

    public void dropBall() {
        player = new CustomPlayer();
        player.setPath(getClass().getResource("/de/jonas/res/kick.mp3"));
        player.play(-1);
    }

}
