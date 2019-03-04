import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while (scan.hasNext()) {
            int n = scan.nextInt();
            int[] arNumber = new int[n];
            int min = 0;
            int minIndex = 0;
            for (int i = 0; i < n; i++) {
                arNumber[i] = scan.nextInt();
            }
            Arrays.sort(arNumber);

            for (int j = 0; j < arNumber.length; j++) {

                if (arNumber[j] < 10) {
                    System.out.print("000");
                } else if (arNumber[j] < 100) {
                    System.out.print("00");
                }else if (arNumber[j] < 1000) {
                    System.out.print("0");
                }
                System.out.println(arNumber[j]);
            }
        }
    }
}