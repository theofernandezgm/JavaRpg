import utils.display;
import scenes.titlescreen.titlescreen;

public class Main {
    public static void main(String[] args) {
        display display = new display("window", 960, 540);
        display.initialize();

        titlescreen titlescreen = new titlescreen();
        display.setScreen(titlescreen);
    }
}
