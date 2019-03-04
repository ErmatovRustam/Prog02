import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {

            int studentN = scan.nextInt();
            String[] ar1 = new String[studentN];
            String[] ar2 = new String[studentN];

            for (int j = 0; j < studentN; j++) {
                ar1[j] = scan.next();
            }
            boolean check = false;
            for (int j = 0; j < studentN; j++) {
                ar2[j] = scan.next().toUpperCase();
                int p = 0;
                int m = 0;
                int a = 0;
                //ar2[j] = ar2[j].replace("M", "");

                for (int k = 0; k < ar2[j].length(); k++) {
                    String r = ar2[j].toString();
                    if (r.charAt(k) == 'P'){
                        p++;
                    }
                    if (r.charAt(k) == 'M') {
                        m++;
                    }
                    if (r.charAt(k) == 'A') {
                        a++;
                    }
                }

                int sum = 100 * p / (p + a);

                if (sum < 75) {
                    System.out.print((!check ? "" : " ") + ar1[j]);
                    check = true;
                }
            }
            System.out.println();
        }
    }
}