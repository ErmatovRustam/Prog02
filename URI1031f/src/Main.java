import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int region = scan.nextInt();

            if(region ==0){
                break;
            }

            for(int i = 1; ;i++){
                if((check(region, i))== 13){
                    System.out.println(i);
                    break;
                }
            }
            // commnent
            /** sdklfjsd///sdkjfls*/
            /* /* This will compile */ */
            /* This will compile */

        }

    }
    public static int check(int region, int step){
        int cut = -step;

        ArrayList<Integer> ar = new ArrayList<>();
        for(int i = 1; i<= region; i++ ){
            ar.add(i);
        }

        while (ar.size() != 1){
            cut += step;

            while (cut>= ar.size()){
                cut -= ar.size();
            }
            ar.remove(cut);
            cut--;
        }
        return ar.get(0);


    }

}