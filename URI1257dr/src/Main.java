import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int sum = 0;
            int wordN = scan.nextInt();

            for (int j = 0; j < wordN; j++) {
                String word = scan.next();
                char[] ar = word.toCharArray();

                for (int e = 0; e < ar.length; e++) {
                    sum += (int) (ar[e]) - 65;
                    sum += j;
                    sum += e;
                }
            }
            System.out.println(sum);
        }
    }
}