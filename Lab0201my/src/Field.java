public class Field {
    private int height;
    private int width;
    private char[][] data;


    public Field(int aWidth, int aHeight) {

        width = aWidth;
        height = aHeight;
        data = new char[width][height];

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                data[i][j] = '.';
            }
        }
    }

    public void print() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(data[i][j]);
            }
            System.out.println();
        }
    }
    public boolean inRange(int col, int row){
        return 0<= row && row < height && 0 <= col && col <=width;
    }
}
