public class Main {

    static final int H = 20;
    static final int W = 20;
    static char[][] field = new char[H][W];

    public static void main(String[] args) {


        init();
        print();
    }

    static void init() {

        for (int i = 0; i < H; ++i) {
            for (int j = 0; j < W; ++j) {
                field[i][j] = '.';
            }
        }
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
