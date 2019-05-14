public class Circle {
    int x;
    int y;
    int r;
    public Circle(int x, int y, int r){
        this.x = x;
        this.y = y;
        this.r = r;
        if (r < 0 ) {
            throw new RuntimeException("Incorrect");
        }
    }

    public boolean contains(int ax, int ay) {
        int dx = ax - x;
        int dy = ay - y;
        return dx * dx + dy * dy <= r * r;
    }
    @Override
    public String toString() {
        return String.format("Circle: %d, %d, %d", x, y, r);
    }




}
