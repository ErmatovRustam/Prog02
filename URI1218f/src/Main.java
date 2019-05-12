import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int time = 1;
        while (scan.hasNext()) {

            int num = 0;

            if (time != 1) {
                System.out.println();
            }
            int size = scan.nextInt();
            int sumF = 0;
            int sumM = 0;
            scan.nextLine();
            String box = scan.nextLine();
            String[] ar = box.split(" ");

            for (int i = 0; i < ar.length-1; i++) {
                if (i % 2 == 0) {
                     num = Integer.parseInt(ar[i]);
                }
                if (size == num) {

                    if (ar[i + 1].equals("F")) {
                        sumF++;
                    }
                    if (ar[i + 1].equals("M")) {
                        sumM++;
                    }
                }
            }

            System.out.printf("Caso %d:\n", time);
            System.out.println("Pares Iguais: " + (sumF + sumM));
            System.out.println("F: " + sumF);
            System.out.println("M: " + sumM);

            time++;

        }
    }
}