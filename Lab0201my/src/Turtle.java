public class Turtle {
    static final int UP =0;
    static final int RIGHT =1;
    static final int DOWN =2;
    static final int LEFT =3;

    Field field;
    int row;
    int col;
    int dir;
    boolean penDown;

    public Turtle(Field aField, int aRow, int aCol, int aDir) {

        field = aField;
        row = aRow;
        col = aCol;
        dir = aDir;

        if (!field.inRange(aRow, aCol)) {
            throw new RuntimeException(
                    "Turtle is out of range");
        }
        if (aDir < 0 || aDir > 3) {
            throw new RuntimeException(
                    "Incorrect direction"
            );
        }

        public void penDown() {
            isPenDown = true;
        }
        public void penUP () {
            isPenDown = false;
        }
        public void turnRight () {
            dir++;
            if (dir == 4) {
                dir = UP;
            }
        }
        public void turnLeft () {
            dir--;
            if (dir == -1) {
                dir = LEFT;
            }
        }
        public void move ( int dis){
            for (int i = 0; i < dis; i++) {
                if (penDown) {
                    field.set(row, col)

                    }
                }
            }
        }

    }


}
