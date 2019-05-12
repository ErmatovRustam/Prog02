public class Rect {
    int w;
    int h;

    public Rect(int aX, int aY, int aW, int aH) {

        w = aW;
        h = aH;

        if (w < 0 || h < 0) {
            throw new RuntimeException("Error");
        }

    }

    public boolean contains(int aX, int aY) {
        return x <= aX && y <= aY && aX < x + w && aY < y + h;
    }

    @Override

    public String toString() {
        return String.format("Rect: %d, %d, %d, %d", x, y, w, h);
    }
}
