import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = 1000;
        ArrayList<Integer> ar1 = new ArrayList<>();

        long beg1 = System.currentTimeMillis();

        for (int i = 0; i < N; i++) {
            ar1.add(i);
        }
        // time
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - beg1);


        Arraylist ar2 = new Arraylist();
        long beg2 = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            ar2.add(i);
        }

        long end2 = System.currentTimeMillis();
        System.out.println("Method: " + (end2 - beg2));
    }
}
