import javafx.scene.shape.Circle;
import processing.core.PConstants;

import java.util.ArrayList;
import java.util.Random;

public class PlayScreen {
    Main main;
    FieldScreen field;
    final int UP = 0;
    final int RIGHT = 1;
    final int DOWN = 2;
    final int LEFT = 3;
    int direction = UP;
    int row = 0;
    int col = 0;
    int colC = 230;
    int rowC = 100;
    static int rowRandom = 230, colRandom = 100;
    static int v, h;

    public PlayScreen(Main main, FieldScreen field) {
        this.main = main;
        this.field = field;
    }

    public Main.State run() {
        main.frameRate(main.originalLevel);
        int speed = main.originalLevel;
        int x = main.recx;
        int y = main.recy;

        field.run();
        main.fill(200, 100, 100);
        main.rectMode(PConstants.CENTER);

        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 20; j++) {
                main.rect(230 + i * 30, 100 + j * 30, 30, 30);
            }
        }

        main.ellipseMode(PConstants.CENTER);
        main.fill(10, 255, 55);
        ArrayList<Circle> arrayList = new ArrayList<>();
        main.ellipse(colC + row * 30, rowC + col * 30, 30, 30);


        Random rnd = new Random();
        main.fill(255, 0, 10);
        main.ellipse(rowRandom, colRandom, 30, 30);
        if (colC + row * 30 == rowRandom && rowC + col * 30 == colRandom) {
            v = (int) main.random(0, 30);
            h = (int) main.random(0, 20);
            ++main.score;
            rowRandom = 230 + v * 30;
            colRandom = 100 + h * 30;
            // main.arr.add(new Circle(colC + row * 30,rowC + col * 30, 30));

            if (main.score >= main.best) {
                main.best = main.score;
            }

        }


        if (main.keyCode == Main.ESC) {
            return Main.State.EXIT;
        } else {
            if (main.keyCode == main.UP) {
                moveUp(speed);
                if (col< 0) {
                    return Main.State.RESULT;
                }
            }
            if (main.keyCode == main.DOWN) {
                moveDown(speed);
                if (col> 19) {
                    return Main.State.RESULT;
                }
            }
            if (main.keyCode == main.RIGHT) {
                moveRight(speed);
                if (row> 29) {
                    return Main.State.RESULT;
                }
            }
            if (main.keyCode == main.LEFT) {
                moveLeft(speed);
                if (row< 0) {
                    return Main.State.RESULT;
                }
            }
        }

        return Main.State.PLAY;
    }

    public void moveUp(int speed) { col--; }

    public void moveRight(int speed) {
        row++;
    }

    public void moveLeft(int speed) {
        row--;
    }

    public void moveDown(int speed) {
        col++;
    }
}
