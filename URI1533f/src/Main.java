import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n != 0) {
            int[] ar = new int[n];
            int[] ar2 = new int[n];
            int max = 0;
            for (int i = 0; i < ar.length; i++) {
                ar[i] = scan.nextInt();
                ar2[i] = ar[i];
            }
            Arrays.sort(ar2);

            for (int i = 0; i < ar.length; i++) {
                if (ar[i] == ar2[n - 2]) {
                    System.out.println(i+1);
                }


            }
            n = scan.nextInt();
        }
    }
}