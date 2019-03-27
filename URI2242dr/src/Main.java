import java.util.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.next();
        int sum = 0;
        char[] ar = line.toCharArray();
        char[] vow = {'a', 'e', 'i', 'o', 'u'};
        String s = "";


        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < vow.length; j++) {
                if (ar[i] == vow[j]) {
                    s += ar[i];
                }
            }
        }

        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {

            if (s.charAt(i) != s.charAt(j)) {
                sum++;
            }
        }

        if (sum > 0) {
            System.out.println("N");
        } else
            System.out.println("S");
    }
}
