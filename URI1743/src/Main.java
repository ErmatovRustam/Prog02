import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] ar1 = new int[5];
        int[] ar2 = new int[5];
        int sum = 0;

        for(int i = 0; i<5; i++){
            ar1[i] = scan.nextInt();
        }
        for(int i = 0; i<5; i++){
            ar2[i] = scan.nextInt();
        }
        for (int i = 0, j = 0; i < ar1.length; i++, j++) {
            if (ar1[i] != ar2[j]) {
                sum++;
            }
        }

        if (sum == 5) {
            System.out.println("Y");
        } else
            System.out.println("N");
    }
}
