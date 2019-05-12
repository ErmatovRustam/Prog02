public class Circle extends Figure {
  private int r;

    public Circle(int x, int y, int r){
        super(x, y);
        this.r = r;

        if(r<0){
            throw new RuntimeException("Incrrect");
        }
    }

    @Override
    public boolean contains(int aX, int aY){
        int dx = aX - x;
        int dy = aY - y;
        return dx * dx + dy * dy <= r* r ;
    }


    @Override
    public String toString(){
        return String.format("Circle: %d, %d, %d", x, y, r);
    }


}
