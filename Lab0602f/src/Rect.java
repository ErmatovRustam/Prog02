public class Rect {
    int x;
    int y;
    int w;
    int h;

    public Rect(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;

        if (w < 0 || h < 0) {
            throw new RuntimeException("Incorrect");
        }
    }


    public boolean contains(int aX, int aY) {
        return x<= aX && aX < x+ w && y <= aY && aY < y + h;
    }

    @Override
    public String toString() {
        return String.format("Rect: %d, %d, %d, %d", x, y, w, h);
    }
}
