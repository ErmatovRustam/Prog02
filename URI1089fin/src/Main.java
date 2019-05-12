import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n != 0) {
            int sum = 0;
            int[] ar = new int[n + 1];
            char[] ar2 = new char[n+1];

            for(int i = 0; i< n; i++){
                ar[i] = scan.nextInt();
            }
            ar[n] = ar[0];

            for(int j = 1; j<ar.length; j++){

                if(ar[j] > ar[j-1]){
                    ar2[j-1] = '+';
                }
                if(ar[j] < ar[j-1]){
                    ar2[j-1] = '-';
                }
                if(ar[j] == ar[j-1]){
                    ar2[j-1] = '=';
                }

                if(ar[0] > ar[n-1]){
                    ar2[n] = '+';
                }
                if(ar[0] < ar[n-1]){
                    ar2[n] = '-';
                }
                if(ar[0] == ar[n-1]){
                    ar2[n] = '=';
                }
            }

            for(int k = 1; k<ar2.length ; k++){
                if(ar2[k] == '=' ){
                    ar2[k] = ar2[k-1];
                }

                if(ar2[k-1] != ar2[k]){
                    sum++;
                }
            }

            System.out.println(sum);









            n = scan.nextInt();
        }
    }
}

