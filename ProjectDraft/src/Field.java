//Field
import processing.core.PApplet;

public class Field {
    private int width, height;
    private int color;

    public Field(int width, int height, int color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    void draw(PApplet papplet) {
        float cellSize = PApplet.min(papplet.width / width, papplet.height / height);

        float fieldSizeX = width * cellSize;
        float fieldSizeY = height * cellSize;

        float centerX = (papplet.width - fieldSizeX) / 2;
        float centerY = (papplet.height - fieldSizeY) / 2;

        papplet.fill(color);
        for (int y = 0; y < height; ++y) {
            for (int x = 0; x < width; ++x) {
                float screenX = centerX + x * cellSize;
                float screenY = centerY + y * cellSize;
                papplet.rect(screenX, screenY, cellSize, cellSize);
            }
        }
    }
}