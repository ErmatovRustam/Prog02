import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            String line = scan.nextLine();
            int space = 0;
            char[] ar = line.toCharArray();
            int length = ar.length;

            for (int i = 0; i < ar.length; i++) {


                for (int s = 0; s < space; s++)
                    System.out.print(" ");
                space++;

                for (int j = 0; j < length; j++) {
                    System.out.print(ar[j]);

                    if (j < length - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                length--;

            }
            System.out.println();
        }
    }
}
