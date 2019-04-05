import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        while (n1 != 0 && n2 != 0) {
            int counter = 0;
            int[] arNum = new int[1000];
            scan.nextLine();
            String word = scan.nextLine();
            String[] ar = word.split(" ");

            for (int i = 0; i < ar.length; i++) {
                int k = Integer.parseInt(ar[i]);
                arNum[k]++;
            }

            for (int i = 0; i < arNum.length; i++) {
                if (arNum[i] > 0 && arNum[i] >= n2) {
                    counter++;
                }
            }
            System.out.println(counter);


            n1 = scan.nextInt();
            n2 = scan.nextInt();
        }
    }
}
