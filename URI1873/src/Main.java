import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 1; i <= n; ++i) {
            String word1 = scan.next();
            String word2 = scan.next();
            if (word1.equals(word2)) {
                System.out.println("empate");
            } else if (word1.equals("tesoura") && word2.equals("papel") || word1.equals("papel") && word2.equals("pedra")
                    || word1.equals("pedra") && word2.equals("lagarto") || word1.equals("lagarto") && word2.equals("spock")
                    || word1.equals("spock") && word2.equals("tesoura") || word1.equals("tesoura") && word2.equals("lagarto")
                    || word1.equals("lagarto") && word2.equals("papel") || word1.equals("papel") && word2.equals("spock")
                    || word1.equals("spock") && word2.equals("pedra") || word1.equals("pedra") && word2.equals("tesoura")) {
                System.out.println("rajesh");
            } else {
                System.out.println("sheldon");
            }
        }
    }
}
