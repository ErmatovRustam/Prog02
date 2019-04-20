public class ResultScreen {
    Main main;

    public ResultScreen(Main main){
        this.main = main;
    }

    public Main.State run(){
        main.background(0);
        main.textSize(72);
        main.fill(100, 100, 255);
        main.text("Your Result", 470, 100);
        main.fill(255, 0, 255);
        main.text("               " + main.score, 320, 350);
        main.textSize(50);
        main.fill(255, 0, 10);
        main.text("Best result was: " + main.best, 385, main.height-40);


        //if(main.keyPressed){
        if(main.keyCode == Main.ESC){
            return Main.State.EXIT;
        }
        else if (main.keyCode == Main.ENTER){
            return Main.State.LEVEL;
        }
        main.keyCode = 0;
        //  }
        return Main.State.RESULT;
    }
}
