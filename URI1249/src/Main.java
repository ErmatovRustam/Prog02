import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextLine()) {
            String word = scan.nextLine();
            char[] ar = word.toCharArray();

            for (int i = 0; i < ar.length; i++) {
                if (Character.isLetter(ar[i]) && Character.isLowerCase(ar[i])) {
                    int r = (int) (ar[i]);
                    int fin = r + 13;
                    if (r == 32) {
                        fin = 32;
                    }
                    fin = r + 13;
                    if (fin > 122) {
                        fin = fin - 122 + 97 - 1;
                    }
                    char f = (char) (fin);
                    System.out.print(f);

                }
                if (Character.isLetter(ar[i]) && Character.isUpperCase(ar[i])) {
                    int r = (int) (ar[i]);
                    int fin = r + 13;
                    if (r == 32) {
                        fin = 32;
                    }
                    fin = r + 13;
                    if (fin > 90) {
                        fin = fin - 90 + 65 - 1;
                    }
                    char f = (char) (fin);
                    System.out.print(f);

                }
                if (!(Character.isLetter(ar[i]))) {
                    System.out.print(ar[i]);
                }
            }
            System.out.println();

        }
    }
}

