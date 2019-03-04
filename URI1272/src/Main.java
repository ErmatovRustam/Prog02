import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < n; i++) {
            String word = scan.nextLine();
            char[] ar = word.toCharArray();
            if (ar[0] != ' '){
                System.out.print(ar[0]);
            }

            for (int j = 0; j < ar.length; j++) {

                    if (ar[j] == ' ' && j != ar.length - 1 && Character.isLetter(ar[j+1])) {
                        System.out.print(ar[j + 1]);
                    }
            }
            System.out.println();
        }

    }
}
