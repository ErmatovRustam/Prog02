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

            for(int k = 0; k<n; k++){
                int dif = max - ar[k].length();
                for(int o = 0; o<dif; o++){
                    System.out.print(" ");
                }
                System.out.println(ar[k]);
            }
            condition = true;
        }
    }
}