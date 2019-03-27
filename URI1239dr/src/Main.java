import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            String line = scan.nextLine();
            String ss = "";
            int num1 = 0;
            int num2 = 0;

            char[] ar = line.toCharArray();

            for (int i = 0; i < ar.length; ++i) {

                if (ar[i] == 95) {
                    if (num1 % 2 == 0) {
                        ss += "<i>";
                        num1++;
                    } else {
                        ss += "</i>";
                        num1++;
                    }
                }
                if (ar[i] == 42) {
                    if (num2 % 2 == 0) {
                        ss += "<b>";
                        num2++;
                    } else {
                        ss += "</b>";
                        num2++;
                    }
                } else if (ar[i] != 95 && ar[i] != 42) {
                    ss += ar[i];
                }

            }
            System.out.println(ss);
        }
    }
}