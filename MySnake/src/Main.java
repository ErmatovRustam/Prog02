import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import processing.core.PApplet;

import java.awt.*;
import java.util.ArrayList;

public class Main extends PApplet {
    enum State {TITLE, LEVEL, PLAY, RESULT, EXIT, FIELD}

    State gameState = State.TITLE;

    int originalLevel = 5;
    int recx = 180;
    int recy = 60;
    int score = -1;
    int best = -1;
    private int FIELD_COLOR = 0xfff4d442;
    private int SNAKE_COLOR = 0xff30ff37;
    private int APPLE_COLOR = 0xfff91111;


    TitleScreen titleScreen = new TitleScreen(this);
    LevelScreen levelScreen = new LevelScreen(this);
    FieldScreen fieldScreen = new FieldScreen(this, levelScreen, 30, 20, FIELD_COLOR);
    Snake snake = new Snake(this, fieldScreen, 0, 0, 1, 0, SNAKE_COLOR);
    Apple apple = new Apple(this, fieldScreen, snake, APPLE_COLOR);
    PlayScreen playScreen = new PlayScreen(this, fieldScreen,levelScreen, snake, apple);
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