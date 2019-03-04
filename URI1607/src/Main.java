import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int sum = 0;

            String word1 = scan.next();
            String word2 = scan.next();

            for (int j = 0; j < word1.length(); j++) {
                if (((word2.charAt(j) - (word1.charAt(j)) < 0))) {
                    sum += 26 + ((word2.charAt(j) - (word1.charAt(j))));
                } else {
                    sum += (word2.charAt(j) - (word1.charAt(j)));
                }


            }
            System.out.println(sum);
        }

        }
    }
