import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while (scan.hasNextLine()) {
            String word = scan.nextLine();
            char[] ar = word.toCharArray();
            int step = 0;
            for (int i = 0; i < ar.length; i++) {


                if (ar[i] != 32) {
                    ++step;
                    if (step % 2 != 0) {
                        ar[i] = Character.toUpperCase(ar[i]);
                    } else {
                        ar[i] = Character.toLowerCase(ar[i]);
                    }
                }
            }
            String s = new String(ar);
            System.out.println(s);
        }

    }
}
