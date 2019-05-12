import processing.core.PApplet;
import processing.core.PConstants;

class Apple {

    private int x, y;
    private int color;
    private Field field;

    Apple(Field field, Snake snake, int color) {


        do {
            x = (int) (Math.random() * field.getWidth());
            y = (int) (Math.random() * field.getHeight());

        } while (snake.collides(x, y));
        this.color = color;
        this.field = field;
    }
    int getX() {
        return x;
    }
    int getY() {
        return y;
    }

    void draw(PApplet applet) {

        applet.fill(color);
        float cellSize = field.getCellsize(applet.width, applet.height);
        float screenX = field.getScreenX(cellSize, applet.width, x);
        float screenY = field.getScreenY(cellSize, applet.height, y);

        applet.ellipseMode(PConstants.CORNER);
        applet.ellipse(screenX, screenY, cellSize, cellSize);
    }


}
