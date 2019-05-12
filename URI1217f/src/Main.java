import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        double sumKG = 0;
        double sum$ = 0;

        for (int i = 0; i < n; i++) {
            double money = scan.nextDouble();
            sum$ += money;
            scan.nextLine();

            String names = scan.nextLine();
            String[] ar = names.split(" ");
            sumKG += ar.length;
            System.out.printf("day %d: %d kg\n", i + 1, ar.length);
        }
        System.out.printf("%.2f kg by day\n", sumKG / n);
        System.out.printf("R$ %.2f by day\n", sum$ / n);


    }
}
