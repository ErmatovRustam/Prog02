import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int fin = 0;
        for (int i = 0; i < n; i++) {
            String word = scan.next();
            int jump = scan.nextInt();
            char[] ar = word.toCharArray();


            for (int j = 0; j < ar.length; j++) {

                fin = (int) (ar[j]) - jump;
                if (fin < 65) {
                    int diff = 65 - fin;
                    fin = 91 - diff;
                }
                System.out.print((char) (fin));
            }
            System.out.println();
        }
    }
}