import processing.core.PApplet;

public class Main extends PApplet {

    private int FIELD_COLOR = 0xfff4d442;
    private int SNAKE_COLOR = 0xff30ff37;
    private int APPLE_COLOR = 0xfff91111;

    private Field field;
    private Apple apple;
    private Snake snake;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        field = new Field(30, 20, FIELD_COLOR);
        snake = new Snake(field, 0, 0, 1, 0, SNAKE_COLOR);
        apple = new Apple(field, snake, APPLE_COLOR);
    }


    public void draw() {
        background(0);
        snake.move();

        if (snake.headCollides(apple)) {
            snake.grow();
            apple = new Apple(field, snake, APPLE_COLOR);
        }
        field.draw(this);
        apple.draw(this);
        snake.draw(this);
        delay(100);
    }

    public void keyPressed() {
        switch (keyCode) {
            case UP:
                snake.turnUp();
                break;
            case DOWN:
                snake.turnDown();
                break;
            case RIGHT:
                snake.turnRight();
                break;
            case LEFT:
                snake.turnLeft();
                break;
        }
    }

    public static void main(String... args) {
        PApplet.main("Main");
    }
}