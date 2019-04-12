import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int[] ar = new int[10];

            for (int j = 0; j < ar.length; j++) {
                ar[j] = scan.nextInt();
            }

            if (ar[8] >= ar[0] && ar[9] >= ar[1] &&
                    ar[8] <= ar[2] && ar[9] >= ar[3] &&
                    ar[8] <= ar[4] && ar[9] <= ar[5] &&
                    ar[8] >= ar[6] && ar[9] <= ar[7]) {
                System.out.println(1);
            } else
                System.out.println(0);
        }
    }
}
;