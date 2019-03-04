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
                if (Character.isLetter(wordArr[p])) { // check if char is letter
                    int indexOfLetter = wordArr[p] - 97; // 97 is ascii code of 'a'
                    letters[indexOfLetter]++;
                }
            }

            // identifying most frequency
            int max = letters[0];
            for (int p = 0; p < letters.length; ++p) {
                if (letters[p] > max) {
                    max = letters[p];
                }
            }

            // printing most frequent letters
            for (int p = 0; p < letters.length; ++p) {
                if (letters[p] == max) {
                    System.out.print((char) (p + 97)); // convert it to char
                }
            }
            System.out.println();


        }
    }
}
