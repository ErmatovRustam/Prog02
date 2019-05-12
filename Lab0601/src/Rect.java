public class Rect {
    int x;
    int y;
    int w;
    int h;

    public Rect(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.h = h;
        this.w = w;
        if(w<0 || h < 0){
            throw new RuntimeException("Incorrect hight or width");
        }
    }


    public boolean contains(int aX, int aY) {
        return x<= aX && y <= aY && aX <=x+w && aY <= y + h;
    }

    @Override

    public String toString(){
        return String.format("Rect: %d, %d, %d, %d", x, y, w, h );
    }

}
