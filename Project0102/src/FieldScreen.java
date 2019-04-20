import java.util.Random;

public class FieldScreen {
    Main main;
    LevelScreen level;

    public FieldScreen(Main main, LevelScreen level) {
        this.main = main;
        this.level = level;
    }

    public Main.State run() {
        int row = main.recx;
        int col = main.recy;

        main.background(0);
        main.fill(10, 100, 100);
        main.fill(100, 100, 100);
        main.textSize(35);
        main.fill(255, 255, 0);
        main.text("Speed " + main.originalLevel, main.width / 2 - 50, 45);
        main.text("Scores: " + main.score, 100, main.height - 30);
        main.text("Best Result: " + main.best, main.width - 270, main.height - 30);
        return Main.State.PLAY;
    }
}