import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n != 0) {
            int mari = 0;
            int john = 0;

            for (int i = 0; i < n; i++) {
                int coin = scan.nextInt();

                if (coin == 0) {
                    mari++;
                }
                if (coin == 1) {
                    john++;
                }
            }

            System.out.printf("Mary won %d times and John won %d times\n", mari, john);
            n = scan.nextInt();
        }
    }
}
