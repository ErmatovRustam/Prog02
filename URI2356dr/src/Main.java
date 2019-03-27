import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String w1 = scan.next();
            String w2 = scan.next();
            int counter = 0;


            for (int i = 0; i < w1.length(); i++) {
                if (w2.length() + i <= w1.length() && w2.equals(w1.substring(i, i + w2.length()))) {
                    counter++;
                }
            }
            if (counter >= 1) {
                System.out.println("Resistente");
            } else {
                System.out.println("Nao resistente");
            }
        }
    }
}