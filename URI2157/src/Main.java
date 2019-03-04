import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
       String s = "";

        for (int i = 0; i < n; i++) {
            int beg = scan.nextInt();
            int end = scan.nextInt();

            for(int j = beg; j <=end; j++){
                s +=j;
            }
            System.out.print(s);

            for(int k =s.length()-1; k>=0;k--){
                System.out.print(s.charAt(k));
            }
            System.out.println();
            s = "";
        }
    }
}