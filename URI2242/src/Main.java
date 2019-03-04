import java.util.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.next();

        char[] ar = line.toCharArray();
        char[] vow = {'a', 'e', 'i', 'o', 'u'};
        List<Character> fin = new ArrayList<>(line.length());
        int f = 0;
        int sum = 0;

        for (int k = 0; k < ar.length; k++) {
            for (int j = 0; j < vow.length; j++) {
                if (ar[k] == (vow[j])) {
                    fin.add(ar[k]);
                }
            }
        }
        for (int i = 0, j = fin.size() - 1;i < j; i++, j--) {

                if(fin.get(i)!= fin.get(j)){
                    sum++;
                }
        }
        if (sum > 0) {
            System.out.println("N");
        } else
            System.out.println("S");
    }
}
