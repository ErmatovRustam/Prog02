public class LevelScreen {
    Main main;

    public LevelScreen(Main main) {
        this.main = main;
    }

    public Main.State run() {
        main.background(0);
        main.textSize(72);
        main.fill(255, 0, 10);
        main.text("Choose speed:", 450, 100);
        main.textSize(50);
        main.text("Change Arrows UP-DOWN to continue: ENTER", 100, main.height - 50);
        main.fill(100, 100, 255);
        main.text("⇧", main.width / 2-5, main.height / 2 - 80);
        main.text("⇩", main.width / 2-5, main.height / 2 + 80);



        if (main.keyPressed) {

            if (main.keyCode == Main.ESC) {
                return Main.State.EXIT;
            } else {

                if (main.keyCode == Main.UP) {
                    main.originalLevel++;
                    if(main.originalLevel >15){
                        main.originalLevel = 1;
                    }
                }
                if (main.keyCode == Main.DOWN) {
                    main.originalLevel--;
                    if(main.originalLevel <1){
                        main.originalLevel = 15;
                    }
                }


            }
            return Main.State.LEVEL;
        }
        main.textSize(50);
        main.fill(255, 0, 10);
        main.text(main.originalLevel, main.width / 2, main.height / 2);

        if (main.keyCode == Main.ENTER) {
            return Main.State.PLAY;
        }else
            return Main.State.LEVEL;
    }
}
