import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        while (scan.hasNext()) {
            int n = scan.nextInt();
            int pair = 0;
            scan.nextLine();
            String[] ar = new String[n];
            for (int i = 0; i < n; i++) {
                ar[i] = scan.nextLine();
            }
            for (int i = 0; i < ar.length - 1; i++) {
                for (int j = i + 1; j < ar.length; j++) {

                    if ((ar[i].charAt(0) == ar[j].charAt(0)) && (ar[i].charAt(1) == ar[j].charAt(1)) &&
                            (ar[i].charAt(3) != ar[j].charAt(3))) {
                        pair++;
                        ar[i] = "00 0";
                        ar[j] = "99 9";
                    }
                }
            }

            System.out.println(pair);
            //n = scan.nextInt();
        }
    }
}
