package utils;

import javax.swing.*;

public class display {
    private JFrame frame;
    private final int width;
    private final int height;
    private final String title;

    public display(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
    }

    public void initialize() {
        frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public void setScreen(JPanel panel){
        frame.setContentPane(panel);
        frame.revalidate();
    }
}
