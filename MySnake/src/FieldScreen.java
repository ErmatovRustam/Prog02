class FieldScreen {
    private int width, height;
    private int color;
    Main main;
    LevelScreen level;

    FieldScreen(Main main, LevelScreen level, int width, int height, int color) {
        this.main = main;
        this.width = width;
        this.height = height;
        this.color = color;
        this.level = level;
    }

    int getWidth() {
        return main.width;
    }

    int getHeight() {
        return main.height;
    }

    boolean isInside(int x, int y) {
        return x >= 0 && x < width && y >= 0 && y < height;
    }

    float getCellsize(int screenWidth, int screenHeight) {
        return Math.min(screenWidth / width, screenHeight / height);
    }

    float getScreenX(float cellSize, int screenWidth, int x) {
        float fieldScreenWidth = width * cellSize;
        float centerShiftX = (screenWidth - fieldScreenWidth) / 2;
        return centerShiftX + x * cellSize;
    }

    float getScreenY(float cellSize, int screenHeight, int y) {
        float fieldScreenHeight = height * cellSize;
        float centerShiftY = (screenHeight - fieldScreenHeight) / 2;
        return centerShiftY + y * cellSize;
    }

    public Main.State run() {

        float cellSize = getCellsize(main.width, main.height);
        main.fill(color);

        for (int y = 0; y < height; ++y) {
            for (int x = 0; x < width; ++x) {

                float screenX = getScreenX(cellSize, main.width, x);
                float screenY = getScreenY(cellSize, main.height, y);
                main.rect(screenX, screenY, cellSize, cellSize);
            }
        }
        return Main.State.PLAY;
    }
}