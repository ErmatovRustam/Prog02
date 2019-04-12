import processing.core.PImage;

public class TitleScreen {
    Main main;

    public TitleScreen(Main main){
        this.main = main;
    }

    public Main.State run(){
        main.background(0);
        main.textSize(72);
        main.fill(100, 100, 255);
        main.text("SuperSnake", 470, 100);
        main.fill(255, 0, 255);
        main.text("Created by: Rustam", 320, 350);
        main.textSize(50);
        main.fill(255, 0, 10);
        main.text("Press SPACE to continue", 385, main.height-40);


        if(main.keyPressed){
            if(main.keyCode == Main.ESC){
                return Main.State.EXIT;
            }
            return Main.State.LEVEL;
        }
        return Main.State.TITLE;
    }
}
