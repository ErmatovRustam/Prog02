public class Turtle {
    static final int UP = 0;
    static final int RIGHT = 1;
    static final int DOWN = 2;
    static final int LEFT = 3;

    Field field;
    int row;
    int col;
    int dir;
    boolean isPenDown = false;

    public Turtle(Field aField, int aRow, int aCol, int aDir) {

        field = aField;

        if (!field.inRange(aRow, aCol)) {
            throw new RuntimeException("Turtle has incorrect position");
        }
        if (aDir < UP || aDir > LEFT) {
            throw new RuntimeException("Incorrect Direction");
        }

        dir = aDir;
        col = aCol;
        row = aRow;
    }

    public void PenDown() {
        isPenDown = true;
    }

    public void PenUp() {
        isPenDown = false;
    }

    public void turnRight() {
        ++dir;
        if (dir == 4) {
            dir = UP;
        }
    }
    public void turnLeft() {
        --dir;
        if (dir == -1) {
            dir = LEFT;
        }
    }
    public void move(int d){
        for(int i = 0; i<d; i++){
            if(isPenDown){
                field.set(row, col);
            }
            switch (dir){
                case UP:
                    --row;
                    break;
                case RIGHT:
                    ++col;
                    break;
                case DOWN:
                    --row;
                    break;
                case LEFT:
                    --col;
                    break;
            }
            if (!field.inRange(row, col)) {
                throw new RuntimeException("Turtle is out of field");
            }

        }
    }
}
