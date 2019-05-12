import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] ar = new int[2001];
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int index = scan.nextInt();
            ar[index]++;
        }

        for(int i =0; i<ar.length; i++){
            if(ar[i]>0){
                System.out.printf( i + " aparece %d vez(es)\n", ar[i]);
            }
        }
    }
}
