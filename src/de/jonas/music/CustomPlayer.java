package de.jonas.music;

import javax.swing.JOptionPane;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;

import javazoom.jl.player.advanced.AdvancedPlayer;

public class CustomPlayer {

    private AdvancedPlayer player;
    private InputStream FIS;
    private BufferedInputStream BIS;
    private boolean canResume;
    private URL path;
    private int total;
    private int stopped;
    private boolean valid;

    public CustomPlayer(){
        player = null;
        FIS = null;
        valid = false;
        BIS = null;
        path = null;
        total = 0;
        stopped = 0;
        canResume = false;
    }

    public void setPath(URL path){
        this.path = path;
    }

    public void pause(){
        try {
            stopped = FIS.available();
            player.close();
            FIS = null;
            BIS = null;
            player = null;
            if(valid) canResume = true;
        } catch (Exception ignored){

        }
    }

    public void stop() {
        player.stop();
    }

    public void restart() {
        pause();
        stopped = total;
        resume();
    }

    public boolean isRunning() {
        return player != null;
    }

    public void resume(){
        if(!canResume) return;
        System.out.println("Total: " + total + " Stopped: " + stopped);
        if(play(total-stopped)) canResume = false;
    }

    public boolean play(int pos){
        valid = true;
        canResume = false;
        try{
            FIS = path.openStream();
            total = FIS.available();
            if(pos > -1) FIS.skip(pos);
            BIS = new BufferedInputStream(FIS);
            player = new AdvancedPlayer(BIS);
            new Thread(
                () -> {
                    try{
                        player.play();
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, "Error playing mp3 file");
                        valid = false;
                        e.printStackTrace();
                        System.exit(0);
                    }
                }
            ).start();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error playing mp3 file");
            valid = false;
            e.printStackTrace();
            System.exit(0);
        }
        return valid;
    }

}
