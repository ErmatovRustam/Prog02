import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < n; i++) {
            String word = scan.nextLine();
            char[] ar = word.toCharArray();

            int beg1 = ar.length / 2;

            for (int k = beg1 - 1; k >= 0; k--) {
                System.out.print(ar[k]);
            }
            for (int j = ar.length - 1; j >= beg1; j--) {
                System.out.print(ar[j]);

            }
            System.out.println();
        }

    }
}