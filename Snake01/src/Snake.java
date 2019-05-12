import processing.core.PApplet;
import processing.core.PConstants;

import java.awt.*;
import java.util.ArrayList;

class Snake {

    private ArrayList<Point> body;
    private int head;
    private int dx, dy;
    private int color;
    private boolean isDead;
    private Field field;

    Snake(Field field, int x, int y, int dx, int dy, int color) {

        body = new ArrayList<>();
        body.add(new Point(x, y));
        head = 0;
        this.dx = dx;
        this.dy = dy;
        this.color = color;
        this.field = field;
        isDead = false;
    }

    private int getX() {
        return body.get(head).x;
    }

    private int getY() {
        return body.get(head).y;
    }

    private void setX(int x) {
        body.get(head).x = x;
    }

    private void setY(int y) {
        body.get(head).y = y;
    }

    boolean collides(int x, int y) {
        for (Point bodyPart : body) {
            if (bodyPart.x == x && bodyPart.y == y) {
                return true;
            }
        }
        return false;
    }

    boolean headCollides(Apple apple) {
        return getX() == apple.getX() && getY() == apple.getY();
    }

    void turnUp() {
        dx = 0;
        dy = -1;
    }

    void turnDown() {
        dx = 0;
        dy = 1;
    }

    void turnRight() {
        dx = 1;
        dy = 0;
    }

    void turnLeft() {
        dx = -1;
        dy = 0;
    }

    void move() {
        if (isDead) {
            return;
        }
        int nextX = getX() + dx;
        int nextY = getY() + dy;

        head = (head + 1) % body.size();

        if (!field.isInside(nextX, nextY)) {
            isDead = true;
        } else {
            setX(nextX);
            setY(nextY);
        }
    }

    void grow() {
        body.add(head + 1, new Point(getX(), getY()));
        move();

    }

    void draw(PApplet applet) {

        final int COLOR_DEAD = 0xff000000;
        applet.fill(isDead ? COLOR_DEAD : color);
        float cellSize = field.getCellsize(applet.width, applet.height);
        for (Point bodyPart : body) {
            float screenX = field.getScreenX(cellSize, applet.width, bodyPart.x);
            float screenY = field.getScreenY(cellSize, applet.height, bodyPart.y);

            applet.ellipseMode(PConstants.CORNER);
            applet.ellipse(screenX, screenY, cellSize, cellSize);
        }
    }


}
