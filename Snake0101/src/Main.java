import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {

    static String name;

    float x;
    float y;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        x = width / 2;
        y = height / 2;
        frameRate(100);
    }


    public void draw() {
        background(0);
        textSize(72);
        textAlign(CENTER, CENTER);
        text(name, x, y);
    }

    public static void main(String... args) {
        name = JOptionPane.showInputDialog("Name: ");
        PApplet.main("Main");
    }
}