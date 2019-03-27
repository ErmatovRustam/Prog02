import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();


        for (int i = 0; i < n; i++) {
            int studentN = scan.nextInt();
            int sum = 0;
            String[] ar = new String[studentN];

            for (int j = 0; j < studentN; j++) {
                ar[j] = scan.next();

                if (ar[j].equals(ar[0])) {
                    sum++;
                }
            }

            if (sum == studentN) {
                System.out.println(ar[0]);
            } else {
                System.out.println("ingles");
            }
        }
    }
}