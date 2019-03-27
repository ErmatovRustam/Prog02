import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        while (scan.hasNextInt()) {


            int n = scan.nextInt();

            ar.add(n);
        }
        System.out.println("Original: " + ar);
        reverse(ar);
        System.out.println("After reversing" + ar);
    }
    static void reverse(ArrayList<Integer> ar){

        for (int i = 0; i < ar.size() / 2; i++) {
            int t = ar.get(i);
            ar.set(i, ar.get(ar.size() - 1 - i));
            ar.set(ar.size() - 1 - i, t);
        }

    }

}