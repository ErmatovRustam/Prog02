import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //int times = 0;

        int limit = scan.nextInt();
        for (int i = 1; i <= limit; i++) {
//            times++;
//            if(times != 1){
//                System.out.println();
//            }
            int[][] ar = new int[9][9];


            //  read
            for (int r = 0; r < 9; r++) {
                for (int c = 0; c < 9; c++) {
                    ar[r][c] = scan.nextInt();
                }
            }
            boolean isCorrect = true;

            // check row
            for (int r = 0; r < 9; r++) {
                int[] row = new int[9];
                for (int c = 0; c < 9; c++) {
                    row[c] = ar[r][c];
                }
                isCorrect = checkArray(row);
                if(!isCorrect){
                    break;
                }
            }
            if(!isCorrect){
                System.out.println("Instancia " + i);
                System.out.println("NAO");
                System.out.println();
                continue;
            }

            // check col
            for (int r = 0; r < 9; r++) {
                int[] col = new int[9];
                for (int c = 0; c < 9; c++) {
                    col[c] = ar[c][r];
                }
                isCorrect = checkArray(col);
                if(!isCorrect){
                    break;
                }
            }
            if(!isCorrect){
                System.out.println("Instancia " + i);
                System.out.println("NAO");
                System.out.println();
                continue;
            }



            //first Q
            isCorrect = checkQuad(ar, 0, 3, 0, 3);
            if(!isCorrect){
                System.out.println("Instancia " + i);
                System.out.println("NAO");
                System.out.println();
                continue;
            }
            //second Q
            isCorrect = checkQuad(ar, 0, 3, 3, 6);
            if(!isCorrect){
                continue;
            }
            //third Q
            isCorrect = checkQuad(ar, 0, 3, 6, 9);
            if(!isCorrect){
                System.out.println("Instancia " + i);
                System.out.println("NAO");
                System.out.println();
                continue;
            }

            //
            isCorrect = checkQuad(ar, 3, 6, 0, 3);
            if(!isCorrect){
                System.out.println("Instancia " + i);
                System.out.println("NAO");
                System.out.println();
                continue;
            }
            isCorrect = checkQuad(ar, 3, 6, 3, 6);
            if(!isCorrect){
                System.out.println("Instancia " + i);
                System.out.println("NAO");
                System.out.println();
                continue;
            }
            isCorrect = checkQuad(ar, 3, 6, 6, 9);
            if(!isCorrect){
                System.out.println("Instancia " + i);
                System.out.println("NAO");
                System.out.println();
                continue;
            }

            //
            isCorrect = checkQuad(ar, 6, 9, 0, 3);
            if(!isCorrect){
                System.out.println("Instancia " + i);
                System.out.println("NAO");
                System.out.println();
                continue;
            }
            isCorrect = checkQuad(ar, 6, 9, 3, 6);
            if(!isCorrect){
                System.out.println("Instancia " + i);
                System.out.println("NAO");
                System.out.println();
                continue;
            }
            isCorrect = checkQuad(ar, 6, 9, 6, 9);
            if(!isCorrect){
                System.out.println("Instancia " + i);
                System.out.println("NAO");
                System.out.println();
                continue;
            }




            if(isCorrect){
                System.out.println("Instancia " + i);
                System.out.println("SIM");
                System.out.println();
            }else{
                System.out.println("Instancia " + i);
                System.out.println("NAO");
                System.out.println();

            }
        }
    }

    private static boolean checkArray(int[] row) {
        boolean isCorrect = true;
        Arrays.sort(row);
        for (int i = 0; i < 8; i++) {
            if (row[i] == row[i + 1]) {
                isCorrect = false;
                break;
            }

        }
        return isCorrect;
    }

    private static boolean checkQuad(int[][] row, int fromRaw, int toRaw, int fromCollumn, int toCollumn) {
        int[] oneTypeArray = new int[9];
        int counter = 0;
        for (int i = fromRaw; i < toRaw; i++) {
            for (int j = fromCollumn; j < toCollumn; ++j) {
                oneTypeArray[counter] = row[i][j];
                counter++;
            }
        }

        return checkArray(oneTypeArray);
    }

}

