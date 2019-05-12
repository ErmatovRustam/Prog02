import processing.core.PApplet;
import processing.core.PConstants;

class Apple {

    private int x, y;
    private int color;
    FieldScreen field;
    Main main;
    Snake snake;


    Apple(Main main, FieldScreen field, Snake snake, int color) {
        this.color = color;
        this.field = field;
        this.main = main;
        this.snake = snake;

        do {
            x = (int) (Math.random() * field.getWidth());
            y = (int) (Math.random() * field.getHeight());

        } while (snake.collides(x, y));

    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    void run() {

        main.fill(color);
        float cellSize = field.getCellsize(main.width, main.height);
        float screenX = field.getScreenX(cellSize, main.width, x);
        float screenY = field.getScreenY(cellSize, main.height, y);

        main.ellipseMode(PConstants.CORNER);
        main.ellipse(screenX, screenY, cellSize, cellSize);
    }


}
