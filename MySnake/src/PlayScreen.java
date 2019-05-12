public class PlayScreen {
    Main main;
    FieldScreen field;
    LevelScreen level;
    Snake snake;
    Apple apple;
    final int UP = 0;
    final int RIGHT = 1;
    final int DOWN = 2;
    final int LEFT = 3;

    public PlayScreen(Main main, FieldScreen field, LevelScreen level, Snake snake, Apple apple) {
        this.main = main;
        this.field = field;
        this.level = level;
        this.snake = snake;
        this.apple = apple;

    }

    public Main.State run() {
        main.frameRate(main.originalLevel);

        field.run();
        snake.run();
        snake.move();



        if (main.score >= main.best) {
            main.best = main.score;
        }

        if (main.keyCode == Main.ESC) {
            return Main.State.EXIT;
        }

        return Main.State.PLAY;
    }


}
