import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();
            if(n1==0&&n2==0){
                break;
            }
            int sameA = 0;
            int sameB = 0;

            int[] alice = new int[n1];
            int[] betty = new int[n2];
// scanning
            for (int i = 0; i < n1; i++) {
                alice[i] = scan.nextInt();
                for (int j = 0; j < i; j++) {
                    if (alice[i] == alice[j]) {
                        i--;
                        n1--;
                    }
                }
            }
            for (int i = 0; i < n2; i++) {
                betty[i] = scan.nextInt();
                for (int j = 0; j < i; j++) {
                    if (betty[i] == betty[j]) {
                        i--;
                        n2--;
                    }
                }

            }


            for (int a = 0; a < n1; a++) {
                for (int b = 0; b < n2; b++) {
                    if (alice[a] == betty[b]) {
                        sameA++;
                    }
                }
            }

            for (int b = 0; b < n2; b++) {
                for (int a = 0; a < n1; a++) {
                    if (alice[a] == betty[b]) {
                        sameB++;
                    }
                }
            }
            System.out.println(Math.min(n1- sameA, n2- sameB));
        }
    }
}
