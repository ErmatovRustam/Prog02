public class Cross extends Figure {
    int x;
    int y;
    Rect w;
    Rect h;
    public Cross(int x, int y, int aw, int ah){
        super(x, y);
        w = new Rect(x - ah / 2, y + y - aw / 2, aw, ah);
        h = new Rect(x - aw / 2, y + y - ah / 2 , ah , aw);

    }
@Override
    public boolean contains(int ax, int ay){
        return w.contains(ax, ay) || h.contains(ax, ay);
    }

    @Override
    public String toString() {
        return "Cross: (" + w + ")" + ", (" + h + ")";
    }

}
