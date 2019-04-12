import java.util.Random;

public class PlayScreen {
    Main main;
    final int UP = 0;
    final int RIGHT = 1;
    final int DOWN = 2;
    final int LEFT = 3;
    int direction = UP;
    int recx = 50;
    int recy = 10;


    public PlayScreen(Main main) {
        this.main = main;
    }

    public Main.State run() {
        int speed = main.originalLevel;

        main.background(0);
        main.fill(255, 0, 10);
        main.ellipse(main.xCircle, main.yCircle, 35, 35);
        main.rect(recx, recy, 20, 20);
        if (main.keyCode == Main.ESC) {
            return Main.State.EXIT;
        } else {
            if (main.keyCode == main.UP) {
                moveUp(speed);
                if (main.yCircle < 0) {
                    main.yCircle = main.height;
                }

            }
            if (main.keyCode == main.DOWN) {
                moveDown(speed);
                if (main.yCircle > main.height) {
                    main.yCircle = 0;
                }
            }
            if (main.keyCode == main.RIGHT) {
                moveRight(speed);
                if (main.xCircle > main.width) {
                    main.xCircle = 0;
                }
            }
            if (main.keyCode == main.LEFT) {
                moveLeft(speed);
                if (main.xCircle < 0) {
                    main.xCircle = main.width;
                }
            }
            if (Math.abs(main.xCircle - recx) < 10 && Math.abs(main.yCircle - recy) < 10 ) {
                main.rect(recx +100, recy + 100, 20, 20);
            }

        }

        return Main.State.PLAY;
    }

    public void moveUp(int speed) {
        main.yCircle -= speed;
    }

    public void moveRight(int speed) {
        main.xCircle += speed;
    }

    public void moveLeft(int speed) {
        main.xCircle -= speed;
    }

    public void moveDown(int speed) {
        main.yCircle += speed;
    }
}
