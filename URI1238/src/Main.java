import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            String w1 = scan.next();
            String w2 = scan.next();

            int lw1 = w1.length();
            int lw2 = w2.length();
            int min = Math.min(lw1 ,lw2);
            int max = Math.max(lw1 ,lw2);


            for (int j = 0,k = 0; j < min; k++, j++) {
                char r = w1.charAt(j);
                char r2 = w2.charAt(j);

                System.out.print(r);
                System.out.print(r2);
            }
            for(int b = min; b<max; b++ ){

                if(lw1>lw2){
                    char r = w1.charAt(b);
                    System.out.print(r);
                }
                if(lw1<lw2){
                    char r = w2.charAt(b);
                    System.out.print(r);
                }
            }
            System.out.println();
        }
    }
}
