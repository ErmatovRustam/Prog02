import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        while (n != 0) {

            int mh = 0;
            int jt = 0;

            for (int i = 0; i < n; i++) {
                int coin = scan.nextInt();

                if (coin == 0) {
                    mh++;
                }
                if (coin == 1) {
                    jt++;
                }
            }
            System.out.printf("Mary won %d times and John won %d times\n", mh, jt);


            n = scan.nextInt();
        }
    }
}