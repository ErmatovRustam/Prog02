import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int n = scan.nextInt();
        while (n != 0) {
            int counter = 0;
            String[] ar = new String[n];
            scan.nextLine();
            String line = scan.nextLine();
            ar = line.split(" ");

            for (int i = 1; i < ar.length; i++) {
                if (Integer.parseInt(ar[i]) < Integer.parseInt(ar[i-1])) {
                    ar[i] = "-";
                } else if (Integer.parseInt(ar[i]) >= Integer.parseInt(ar[i-1])) {
                    ar[i] = "+";
                }
            }
            for (int i = 0; i < ar.length - 1; i++) {

                if (ar[i].equals("+") && ar[i + 1].equals("-")) {
                    counter++;
                } else if (ar[i].equals("-") && ar[i + 1].equals("+")) {
                    counter++;
                }
            }
            System.out.println(counter);
            n = scan.nextInt();
        }


    }
}
