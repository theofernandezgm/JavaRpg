package utils;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class inputs extends KeyAdapter {

    private boolean upPressed = false;
    private boolean downPressed = false;
    private boolean leftPressed = false;
    private boolean rightPressed = false;
    private boolean zPressed = false;
    private boolean xPressed = false;

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        if (keyCode == KeyEvent.VK_UP) upPressed = true;
        if (keyCode == KeyEvent.VK_DOWN) downPressed = true;
        if (keyCode == KeyEvent.VK_LEFT) leftPressed = true;
        if (keyCode == KeyEvent.VK_RIGHT) rightPressed = true;
        if (keyCode == KeyEvent.VK_Z) zPressed = true;
        if (keyCode == KeyEvent.VK_X) xPressed = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();

        if (keyCode == KeyEvent.VK_UP) upPressed = false;
        if (keyCode == KeyEvent.VK_DOWN) downPressed = false;
        if (keyCode == KeyEvent.VK_LEFT) leftPressed = false;
        if (keyCode == KeyEvent.VK_RIGHT) rightPressed = false;
        if (keyCode == KeyEvent.VK_Z) zPressed = false;
        if (keyCode == KeyEvent.VK_X) xPressed = false;
    }

    public boolean isKeyPressed(int keyCode) {
        if (keyCode == KeyEvent.VK_UP) return upPressed;
        if (keyCode == KeyEvent.VK_DOWN) return downPressed;
        if (keyCode == KeyEvent.VK_LEFT) return leftPressed;
        if (keyCode == KeyEvent.VK_RIGHT) return rightPressed;
        if (keyCode == KeyEvent.VK_Z) return zPressed;
        if (keyCode == KeyEvent.VK_X) return xPressed;
        return false;
    }

    public String getLastKeyPressed() {
        if (upPressed) return "UP";
        if (downPressed) return "DOWN";
        if (leftPressed) return "LEFT";
        if (rightPressed) return "RIGHT";
        if (zPressed) return "A (mapped from Z)";
        if (xPressed) return "B (mapped from X)";
        return null;
    }
}
