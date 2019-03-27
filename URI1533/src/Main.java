import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        while (n != 0) {
            scan.nextLine();
            String line = scan.nextLine();
            String[] ar = new String[n];
            ar = line.split(" ");
            int max = 0;
            int secMax = 0;

            // find max
            for (int i = 0; i < ar.length; i++) {
                if (Integer.parseInt(ar[i]) > max) {
                    max = Integer.parseInt(ar[i]);
                }
            }

            // delete max
            for (int i = 0; i < ar.length; i++) {
                if (Integer.parseInt(ar[i]) == max) {
                    ar[i] = "0";
                }
            }

            // find max

            int index = 0;
            for (int i = 0; i < ar.length; i++) {
                if (Integer.parseInt(ar[i]) > secMax) {
                    secMax = Integer.parseInt(ar[i]);
                    index = i;
                }
            }

            // print max
            System.out.println(index + 1);

            n = scan.nextInt();
        }

    }
}

