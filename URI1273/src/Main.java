import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n;
        boolean condition = false;
        while ((n = scan.nextInt()) != 0) {
            if (condition) {
                System.out.println();
            }
            String[] ar = new String[n];
            int max = 0;
            for (int i = 0; i < n; i++) {
                ar[i] = scan.next();

                if (ar[i].length() > max) {
                    max = ar[i].length();
                }
            }
            for (int e = 0; e < n; e++) {
                int dif = max - ar[e].length();
                for (int d = 0; d < dif; d++) {
                    System.out.print(" ");
                }
                System.out.println(ar[e]);
            }
            condition = true;
        }

    }
}
