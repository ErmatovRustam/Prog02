public class Circle extends Figure {
    private int r;

    public Circle(int aX, int aY, int aR) {
        super(aX, aY);
        r = aR;
        if (r < 0) {
            throw new RuntimeException("Circle: incorrect args");
        }
    }


    @Override
    public boolean contains(int aX, int aY) {
        int dx = aX - x;
        int dy = aY - y;
        return dx * dx + dy * dy <= r * r;
    }

    @Override
    public String toString() {
        return String.format("Circle: %d, %d, %d", x, y, r);
    }
}