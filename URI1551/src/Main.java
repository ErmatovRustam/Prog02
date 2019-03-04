import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();


        for (int i = 0; i < n; i++) {
            int sum = 0;
            int same = 0;
            int fin = 0;
            int notL = 0;
            int emp = 0;
            int one = 0;
            String word = scan.nextLine();
            String line = word.toLowerCase();
            char[] ar = line.toCharArray();
            int[] alpha = new int[26];


            for (int j = 0; j < ar.length; j++) {

                if (Character.isLetter(ar[j])) {
                    sum++;
                    alpha[(int) ar[j] - 97]++;

                }
            }
            for (int k = 0; k < 26; k++) {
                if (alpha[k] > 1) {
                    same++;
                }
                else if (alpha[k] == 0) {
                    emp++;
                }else if(alpha[k]==1){
                    one++;
                }
            }
            notL = line.length() - sum;
            fin = 26-emp;
            if (fin >= 26) {
                System.out.println("frase completa");
            } else if (fin >= 13 ) {
                System.out.println("frase quase completa");
            } else {

                System.out.println("frase mal elaborada");
            }
        }
    }
}