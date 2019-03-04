import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String word1 = scan.nextLine();
            String word2 = scan.nextLine();

            char[] ar1 = word1.toCharArray();
            char[] ar2 = word2.toCharArray();
            int min = Math.min(ar1.length, ar2.length);
            int sum = 0;
            int max = 0;

            for (int i = 0; i < ar1.length; i++) {
                for (int j = 0; j < ar2.length ; j++) {

                    if (ar1[i] == ar2[j]) {

                        sum = 0;
                        int l = j;
                        for (int k = i; k < min; k++) {
                            l++;
                            if (ar1[k] != ar2[l]) {
                                break;
                            }
                            sum++;


                        }
                        if(max < sum){
                            max = sum;
                        }
                    }
                }
            }
            System.out.println(max);
        }

    }
}
