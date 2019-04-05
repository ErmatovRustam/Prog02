import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while (true) {

            int n1 = scan.nextInt();
            int n2 = scan.nextInt();

            if (n1 == 0 && n2 == 0) {
                break;
            }
            int[] ar = new int[n2];
            for (int i = 0; i < n2; i++) {
                ar[i] = scan.nextInt();
            }
            Arrays.sort(ar);
            int sum = 0;
            int total = 0;

            for (int i = 0, j = 1; j < n2; i++, j++) {
                if (ar[i] == ar[j]) {
                    sum++;
                    if (sum == 1) {
                        total++;
                    }
                }else
                    sum = 0;
            }

            System.out.println(total);
        }

    }
}
