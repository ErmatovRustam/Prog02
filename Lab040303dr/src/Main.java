import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Arraylist ar2 = new Arraylist();


       while (scan.hasNext()){
           int n = scan.nextInt();

            ar2.add(n);
        }
        // time
        System.out.println(ar2);
       reverse(ar2);
        System.out.println(ar2);
        System.out.println(ar2.get(7));
    }

    static void reverse(Arraylist a) {
        for (int i = 0; i < a.size() / 2; ++i) {
            // int t = a[i];
            int t = a.get(i);
            // a[i] = a[a.size() - 1 - i];
            a.set(i, a.get(a.size() - 1 - i));
            // a[a.size() - 1 - i] = t;
            a.set(a.size() - 1 - i, t);
        }
    }

}