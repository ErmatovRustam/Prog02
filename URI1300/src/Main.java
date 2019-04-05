import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            int j = 0, angle;
            boolean check = false;
            for (int i = 0; i < 60; ++i) {
                if (i % 5 == 0) {
                    j++;
                }
                angle = i * 6 - j * 6;


                if (n == Math.abs(angle)) {
                    check = true;
                    break;
                }
            }
            System.out.println((check) ? "Y" : "N");
        }


    }
}
