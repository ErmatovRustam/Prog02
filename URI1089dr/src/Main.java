import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int n = scan.nextInt();
        while (n != 0) {
            int[] ar = new int[n + 1];
            char[] plus = new char[n + 1];

            for (int i = 0; i < n; i++) {
                ar[i] = scan.nextInt();
            }
            ar[n] = ar[0];
            for (int i = 1; i < ar.length; i++) {

                if (ar[i] > ar[i - 1]) {
                    plus[i] = '+';
                }
                if (ar[i] < ar[i - 1]) {
                    plus[i] = '-';
                }
                if (ar[i] == ar[i - 1]) {
                    plus[i] = '=';
                }

                if (ar[0] > ar[n - 1]) {
                    plus[0] = '+';
                }
                if (ar[0] < ar[n - 1]) {
                    plus[0] = '-';
                }
                if (ar[0] == ar[n - 1]) {
                    plus[0] = '=';
                }

            }
            for (int i = 1; i < plus.length; i++) {
                if (plus[i] == '=') {
                    plus[i] = plus[i - 1];
                }
            }
            int sum = 0;
            for (int i = 0; i < plus.length - 1; i++) {
                if (plus[i] != plus[i + 1]) {
                    sum++;
                }
            }
            System.out.println(sum);

n = scan.nextInt();
        }
    }
}