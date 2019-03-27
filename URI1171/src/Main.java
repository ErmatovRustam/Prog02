import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] ar = new int[2001];
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
           int num = scan.nextInt();
           ar[num]++;
        }
        for (int j = 1; j < ar.length ; j++) {

                if (ar[j] >0) {
                    System.out.printf(j + " aparece %d vez(es)\n", (ar[j]));
                }

            }
        }
    }
