public class Field {
    private int width;
    private int height;
    private char[][] data;


    // constructor
    public Field(int aWidth, int aHeight) {

        if (aWidth < 1 || aHeight < 1) {
            throw new RuntimeException("Field: Incorrect field height and width");
        }

        width = aWidth;
        height = aHeight;
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
                System.out.print(data[i][j] = '.');
            }
            System.out.println();
        }

    }

    public  void set(int row, int col){
        data[row][col] = '*';
       // System.out.println(data[col][row]);
    }
    public boolean inRange(int row, int col) {

        throw new RuntimeException()
        }
    }

}
