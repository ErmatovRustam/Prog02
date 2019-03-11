import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int N = 10000;
        long beg = System.currentTimeMillis();
        ArrayList<Integer> ar = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            ar.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("One by one: " + (end - beg));
        ArrayListInt a1 = new ArrayListInt();

        long beg2 = System.currentTimeMillis();

        for (int i = 0; i < N; i++) {
            a1.add(i);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("Method: "+ ( end2 - beg2));


    }
}
