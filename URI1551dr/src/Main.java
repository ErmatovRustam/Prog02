import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < n; i++) {
            int sum = 0;
            String word = scan.nextLine().trim().toLowerCase();
            char[] alphabet = new char[26];
            char[]ar = word.toCharArray();

            for(int j = 0; j<ar.length; j++){
                if(Character.isLetter(ar[j])){
                    alphabet[(int)(ar[j] - 97)]++;
                }
            }

            for(int k = 0; k<alphabet.length;k++){
                if(alphabet[k]>0){
                    sum++;
                }
            }
            if (sum >= 26) {
                System.out.println("frase completa");
            } else if (sum >= 13 ) {
                System.out.println("frase quase completa");
            } else {

                System.out.println("frase mal elaborada");
            }

        }
    }
}
