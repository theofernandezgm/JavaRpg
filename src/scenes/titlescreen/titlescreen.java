package scenes.titlescreen;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class titlescreen extends JPanel {
    private BufferedImage image;

    public titlescreen() {
        try {
            InputStream imageStream = getClass().getResourceAsStream("/assets/titlescreen/background/mainmenu.png");
            if (imageStream != null) {
                image = ImageIO.read(imageStream);
            } else {
                System.err.println("Image not found!");
            }
        } catch (IOException e) {
            System.err.println("Error loading image: " + e.getMessage());
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
