import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        while (n != 0) {
            String word = scan.next();
            char[] ar = word.toCharArray();
            int origin = 0;

            for (int i = 0; i < ar.length; i++) {
                if (ar[i] == 'D') {
                    origin++;
                } else if (ar[i] == 'E') {
                    origin--;
                }

                if (origin == -1) {
                    origin = 3;
                }
                if (origin == 4) {
                    origin = 0;
                }
            }
            if (origin == 0) {
                System.out.println("N");
            }
            if (origin == 1) {
                System.out.println("L");
            }
            if (origin == 2) {
                System.out.println("S");
            }
            if (origin == 3) {
                System.out.println("O");
            }

            n = scan.nextInt();
        }
    }
}
