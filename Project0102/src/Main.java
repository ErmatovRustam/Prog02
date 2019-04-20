import javafx.scene.shape.Circle;
import processing.core.PApplet;

import java.util.ArrayList;

public class Main extends PApplet {
    enum State {TITLE, LEVEL, PLAY, RESULT, EXIT, FIELD}

    State gameState = State.TITLE;

    int originalLevel = 5;
    int recx = 180;
    int recy = 60;
    int score = -1;
    int best = -1;
    int xCircle = recx;
    int yCircle = 75;
    ArrayList<Circle > arr = new ArrayList<Circle>();
    TitleScreen titleScreen = new TitleScreen(this);
    LevelScreen levelScreen = new LevelScreen(this);
    FieldScreen fieldScreen = new FieldScreen(this, levelScreen);
    PlayScreen playScreen = new PlayScreen(this, fieldScreen);
    ResultScreen resultScreen = new ResultScreen(this);
    ExitScreen exitScreen = new ExitScreen();

    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(100);
    }

    public void draw() {
        switch (gameState) {
            case TITLE:
                gameState = titleScreen.run();
                break;
            case LEVEL:
                gameState = levelScreen.run();
                break;
        case FIELD:
            gameState = fieldScreen.run();
            break;
            case PLAY:
                gameState = playScreen.run();
                break;
            case RESULT:
                gameState = resultScreen.run();
                break;
            case EXIT:
                exitScreen.run();
                break;

        }
    }

    public static void main(String... args) {
        PApplet.main("Main");

    }
}