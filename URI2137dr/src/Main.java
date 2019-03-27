import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while (scan.hasNext()) {
            int n = scan.nextInt();
            int[] arNumber = new int[n];


            for (int i = 0; i < arNumber.length; i++) {
                arNumber[i] = scan.nextInt();
            }

            Arrays.sort(arNumber);

            for (int i = 0; i < arNumber.length; i++) {
                if (arNumber[i] < 10) {
                    System.out.print("000");
                }
                else if (arNumber[i] < 100) {
                    System.out.print("00");
                }
               else if (arNumber[i] < 1000) {
                    System.out.print("0");
                }
                System.out.println(arNumber[i]);
            }
        }

    }
}
