package scenes.titlescreen;
import utils.musicplayer;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class titlescreen extends JPanel {
    private BufferedImage image;
    private musicplayer musicPlayer;

    public titlescreen() {
        try {
            InputStream imageStream = getClass().getResourceAsStream("/assets/images/titlescreen/background/mainmenu.png");
            if (imageStream != null) {
                image = ImageIO.read(imageStream);
            } else {
                System.err.println("Image not found!");
            }
        } catch (IOException e) {
            System.err.println("Error loading image: " + e.getMessage());
        }

        musicPlayer = new musicplayer();
        musicPlayer.play("/assets/music/title.wav");
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        }
    }
    public void stop() {
        if (musicPlayer != null) {
            musicPlayer.stop();
        }
    }
}
