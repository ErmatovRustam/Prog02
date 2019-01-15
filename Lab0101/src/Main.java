public class Main {

    static final int H = 20;
    static final int W = 20;
    static char[][] field = new char[H][W];
    static boolean penDown = false;
    static final int turtleRow = 0;
    static final int turtleCol = 0;
    static final int UP = 0;
    static final int RIGHT = 1;
    static final int DOWN = 2;
    static final int LEFT = 3;
    static int turtleDir = RIGHT;


    public static void main(String[] args) {


        init();
        penDown();
        move(10);
        turnRight();
        move(10);
        turnRight();
        move(10);
        turnRight();
        move(10);
        turnRight();
        print();
    }

    private static void turnRight() {

        
    }

    private static void move(int step) {
        for (int i = 0; i < step; ++i) {
            ++turtleDir;
            if (turtleDir == 4) {
                turtleDir = UP;
            }

        }
        if (penDown) {
            for (int i = 0; i < 10; ++i) {
                for (int j = 0; j < 10; ++j) {
                    field[i][j] = '*';
                }
            }
        }
    }


    static void init() {

        for (int i = 0; i < H; ++i) {
            for (int j = 0; j < W; ++j) {
                field[i][j] = '.';
            }
        }
    }

    private static void penDown() {
        penDown = true;
    }

    static void print() {

        for (int i = 0; i < H; ++i) {
            for (int j = 0; j < W; ++j) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }
}
