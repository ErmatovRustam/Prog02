import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while (scan.hasNextLine()) {
            String word = scan.nextLine();
            char[] ar = word.toCharArray();
            int step = 0;
            for (int j = 0; j < ar.length; j++) {

                if (ar[j] != 32) {
                    ++step;
                    if (step % 2 != 0) {
                        ar[j] = Character.toUpperCase(ar[j]);
                    } else {
                        ar[j] = Character.toLowerCase(ar[j]);
                    }
                }
            }
            String s = new String(ar);
            System.out.println(s);

        }
    }
}
