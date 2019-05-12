import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while (scan.hasNext()) {
            int n = scan.nextInt();
            scan.nextLine();
            String[] ar = new String[n];
            int pair = 0;
            for (int i = 0; i < n; i++) {
                ar[i] = scan.nextLine();
            }

            for (int j = 0; j < ar.length - 1; j++) {
                for (int k = j+1; k < ar.length; k++) {

                    if (ar[j].charAt(0) == ar[k].charAt(0) &&
                            ar[j].charAt(1) == ar[k].charAt(1) &&
                            ar[j].charAt(3) != ar[k].charAt(3)) {
                        pair++;
                        ar[j] = "00 0";
                        ar[k] = "99 9";
                    }
                }
            }
            System.out.println(pair);

        }
    }
}