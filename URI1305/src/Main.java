import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            String n = scan.nextLine();
            int a = Integer.parseInt(n);

            if (a < 1) {
                System.out.println();
            } else {
                a = Math.round(a);
                System.out.println((int) a);
            }
        }
    }
}
