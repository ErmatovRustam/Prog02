import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < n; i++) {

            char[] letters = new char[26];
            String word = scan.nextLine().toLowerCase();
            char[] wordArr = word.toCharArray();

            // counting frequency of each letter
            for (int p = 0; p < wordArr.length; ++p) {
                if (Character.isLetter(wordArr[p])) { // check
                    int indexL = wordArr[p] - 97;
                    letters[indexL]++;
                }
            }
            int max = letters[0];
            for (int k = 0; k < letters.length; ++k) {
                if (letters[k] > max) {
                    max = letters[k];
                }
            }
            for (int k = 0; k < letters.length; ++k) {
                if (letters[k] == max) {
                    System.out.print((char) (k + 97));
                }
            }
            System.out.println();
        }
    }
}
