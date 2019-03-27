import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {

            String a = scan.next();
            String b = scan.next();

            char[] ar1 = a.toCharArray();
            char[] ar2 = b.toCharArray();

            if (ar1.length >= ar2.length) {
                int start = ar1.length - ar2.length;

                for (int j = start, k = 0; j < ar1.length; k++, j++) {
                    if (ar1[j] != ar2[k]) {
                        System.out.println("nao encaixa");
                        break;
                    }
                    if (j == ar2.length - 1) {
                        System.out.println("encaixa");
                    }
                }
            } else
                System.out.println("nao encaixa");
        }
    }
}
