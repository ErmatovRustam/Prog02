import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            String word = scan.next();
            char[] ar = word.toCharArray();

            if ((ar[0] == 111 && ar[1] == 110 )|| (ar[1] == 110 && ar[2] == 101) ||( ar[2] == 101 && ar[0] == 111)) {
                System.out.println(1);
            } else if ((ar[0] == 116 && ar[1] == 119) || (ar[1] == 119 && ar[2] == 111) || (ar[2] == 111 && ar[0] == 116)) {
                System.out.println(2);
            } else if ((ar[0] == 116 && ar[1] == 104) || (ar[1] == 104 && ar[2] == 114) || (ar[3] == 101 && ar[4] == 101)) {
                System.out.println(3);


            }


        }
    }

}
