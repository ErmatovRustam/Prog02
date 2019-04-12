import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        while (n1 != 0 && n2 != 0) {

            int[] alice = new int[n1];
            int[] betty = new int[n2];
// scanning
            for (int i = 0; i < n1; i++) {
                alice[i] = scan.nextInt();
            }
            for (int i = 0; i < n2; i++) {
                betty[i] = scan.nextInt();
            }
            //
            int maxA = findMax(alice, betty, n1, n2);
            int maxB = findMax(betty, alice, n2, n1);

            if(maxA > maxB){
                System.out.println(maxB);
            }else{
                System.out.println(maxA);
            }


            n1 = scan.nextInt();
            n2 = scan.nextInt();
        }
    }

    static int findMax(int[] alice, int[] betty, int n1, int n2) {
        int maximum = 0;

        for (int i = 0; i < n1; i++) {
            if (i < n1 - 1 && alice[i] == alice[i + 1]) {
                continue;
            }
            int j;
            for ( j = 0; j < n2; j++) {
                if (betty[j] == alice[i]) {
                    break;
                } else if (betty[j] > alice[i]) {
                    maximum++;
                    break;
                }
            }
            if(j == n2){
                maximum++;
            }
        }

return maximum;
    }
}
