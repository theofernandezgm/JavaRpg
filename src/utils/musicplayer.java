package utils;

import javax.sound.sampled.*;
import java.io.IOException;
import java.io.InputStream;

public class musicplayer {
    private Clip clip;

    public void play(String songPath) {
        try {
            InputStream audioStream = getClass().getResourceAsStream(songPath);
            if (audioStream == null) {
                System.err.println("Error: Audio file not found at " + songPath);
                return;
            }
            System.out.println("Audio file found, loading...");

            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioStream);

            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            System.out.println("Music is playing...");
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.err.println("Error playing audio: " + e.getMessage());
        }
    }


    public void stop() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
            System.out.println("Music stopped.");
        }
    }
}
