import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int row1 = scan.nextInt();
        int col1 = scan.nextInt();
        scan.nextLine();
        String[][] field = new String[row1][col1];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                field[i][j] = scan.nextLine();
            }
        }
        int row2 = scan.nextInt();
        int col2 = scan.nextInt();

        int timesR = row2 / row1;
        int timesC = col2 / col1;


        // print
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                for (int k = 0; k < timesR; k++) {
                    for (int c = 0; c < timesC; c++) {
                        System.out.print(field[i][j]);
                    }
                }

            }
            System.out.println();
        }




    }

}

