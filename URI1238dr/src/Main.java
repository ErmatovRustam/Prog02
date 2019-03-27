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
            int min = Math.min(lw1, lw2);
            int max = Math.max(lw1, lw2);


            for(int j = 0; j<min; j++){
                System.out.print(w1.charAt(j));
                System.out.print(w2.charAt(j));
            }
            if(lw1>lw2){
                System.out.print(w1.substring(min));
            }
            if(lw1<lw2){
                System.out.print(w2.substring(min));
            }
            System.out.println();
        }
    }
}