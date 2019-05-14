public class Circle {
    private int r;
    private static int done = 0;


    public Circle(int r) {
        this.r = r;
        setRadius(r);
        done++;
    }


    public void setRadius(int r) {
        if (r <= 0) {
            throw new IllegalArgumentException("Incorrect radius");
        }
    }

    public static int getN() {
        return done;
    }
}
