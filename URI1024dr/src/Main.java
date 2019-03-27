import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i<n; i++){

            String word = scan.nextLine();
            char[] ar = word.toCharArray();


            for(int j = 0; j<ar.length; j++){

                if(Character.isLetter(ar[j])){
                    int wordN = (int)(ar[j]);
                    ar[j] = (char) (wordN + 3);
                }
            }
            int half = word.length() / 2;
            int end = ar.length - 1;


            for(int k = 0; k<=half-1; k++){
                char temp = ar[end];
                ar[end] = ar[k];
                ar[k] = temp;
                end--;
            }
            for(int k = half; k < ar.length; k++){
                int a = (int)(ar[k]);
                ar[k] = (char)(a - 1);
            }

            for (int q = 0; q < ar.length; q++)
            {
                System.out.print(ar[q]);
            }
            System.out.println("");

        }
    }
}
