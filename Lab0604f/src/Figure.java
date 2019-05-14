public abstract class Figure {
    protected int x;
    protected int y;

    public Figure(int aX, int aY) {
        x = aX;
        y = aY;
    }

//    public void move(int dx, int dy) {
//        x += dx;
//        y += dy;
//    }
public void move(int dx, int dy) {
    x += dx;
    y += dy;
}

    public abstract boolean contains(int aX, int aY);

}


