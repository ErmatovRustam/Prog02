import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < n; i++) {
            String word = scan.nextLine();
            char[] ar = word.toCharArray();

            int beg = ar.length / 2;

            for (int k = beg-1; k >= 0; k--){
                System.out.print(ar[k]);
            }
            for (int k = ar.length-1; k >= beg; k--){
                System.out.print(ar[k]);
            }
            System.out.println();


        }
    }
}
