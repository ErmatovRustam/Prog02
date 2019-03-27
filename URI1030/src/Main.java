import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int n = scan.nextInt();
        int times = 1;
        for(int j = 0; j<n; j++){


            int size = scan.nextInt();
            int jump = scan.nextInt();

            int[] ar = new int[size];

            int tem = -1;

            int limit = 0;
            while (limit != size - 1) {
                int step = 0;
                while (step != jump) {
                    tem++;
                    if(tem==size){
                        tem=0;
                    }
                    if (ar[tem] == 0) {
                        step++;
                    }

                }
                ar[tem] =1;
                limit++;
            }

            for(int i = 0; i< ar.length; i++){
                if(ar[i]==0){
                    System.out.printf("Case %d: %d\n", times, i+1);

                }
            }
            times++;

        }
    }
}
