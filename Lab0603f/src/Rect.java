public class Rect extends Figure {
    private int w;
    private int h;

    public Rect(int aX, int aY, int aW, int aH) {
        super(aX, aY);
        w = aW;
        h = aH;
        if (w < 0 || h < 0) {
            throw new RuntimeException("Rect: incorrect args");
        }
    }

    @Override
    public boolean contains(int aX, int aY) {
        return x <= aX && aX < x + w &&
                y <= aY && aY < y + h;
    }

    @Override
    public String toString() {
        return String.format("Rect: %d, %d, %d, %d", x, y, w, h);
    }
}