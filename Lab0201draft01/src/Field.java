
public class Field {
    private int height;
    private int width;
    private char[][] data;

    public Field(int aHeight, int aWidth) {
        if (aHeight < 1 || aWidth < 1) {
            throw new RuntimeException("Incorrect height or width");
        }
        height = aHeight;
        width = aWidth;
        data = new char[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                data[i][j] = '.';
            }
        }
    }

    public void print() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(data[i][j]);
            }
            System.out.println();
        }

    }

    public void set(int row, int col) {
        data[row][col] = '*';

    }
    public boolean inRange(int row, int col){
        return 0<= row && row< height && 0<= col && col< width;
    }
}
