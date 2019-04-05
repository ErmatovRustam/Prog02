import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {

            int n = scan.nextInt();
            int counter = 0;
            for (int i = 0; i <= 100; i++) {
                for (int j = 0; j <= 100; j++) {

                    if (((i * i) + (j * j)) == n) {
                        counter++;
                    }
                }
            }
            if (counter > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}