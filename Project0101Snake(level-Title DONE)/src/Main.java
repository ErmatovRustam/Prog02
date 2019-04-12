import processing.core.PApplet;
import processing.core.PApplet;
import java.util.*;
import javax.swing.*;


public class Main extends PApplet {
    enum State {TITLE, LEVEL, PLAY, RESULT, EXIT, FIELD}

    State gameState = State.TITLE;

    int originalLevel = 5;
    int recx = 10;
    int recy = 10;
    int xCircle = width / 2;
    int yCircle = height / 2;
    TitleScreen titleScreen = new TitleScreen(this);
    LevelScreen levelScreen = new LevelScreen(this);
    PlayScreen playScreen = new PlayScreen(this);
    // FieldScreen fieldScreen = new FieldScreen(this);
    ResultScreen resultScreen = new ResultScreen();
    ExitScreen exitScreen = new ExitScreen();

    //int gameState;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        frameRate(15);
    }

    public void draw() {
        switch (gameState) {
            case TITLE:
                gameState = titleScreen.run();
                break;
            case LEVEL:
                gameState = levelScreen.run();
                break;
//            case FIELD:
//                gameState = fieldScreen.run();
//                break;
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