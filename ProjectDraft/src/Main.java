//Main

import processing.core.PApplet;

public class Main extends PApplet {
    Field field;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        field = new Field(40, 40, 65);
    }

    public void draw() {
        background(0);
        field.draw(this);
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}

