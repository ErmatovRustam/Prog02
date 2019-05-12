import processing.core.PApplet;

 class Field {
    private int width, height;
    private int color;

    Field(int width, int height, int color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    int getWidth() {
        return width;
    }

    int getHeight() {
        return height;
    }
     boolean isInside(int x, int y) {
        return x>=0 && x< width && y>=0 && y<height;
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

    void draw(PApplet applet) {

        float cellSize = getCellsize(applet.width, applet.height);
        applet.fill(color);

        for (int y = 0; y < height; ++y) {
            for (int x = 0; x < width; ++x) {

                float screenX = getScreenX(cellSize, applet.width, x);
                float screenY = getScreenY(cellSize, applet.height, y);
                applet.rect(screenX, screenY, cellSize, cellSize);
            }
        }
    }



 }
