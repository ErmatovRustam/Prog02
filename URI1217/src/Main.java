import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        double sum = 0;
        double moneySum = 0;
        for (int i = 0; i < n; i++) {
            double money = scan.nextDouble();
            scan.nextLine();
            String line = scan.nextLine();
            String[] ar = line.split(" ");
            moneySum += money;
            System.out.printf("day %d: %d kg\n", (i + 1), (ar.length));
            sum += ar.length;
        }
        System.out.printf("%.2f kg by day\n", (sum / n));
        System.out.printf("R$ %.2f by day", (moneySum / n));
        System.out.println();
    }
}

