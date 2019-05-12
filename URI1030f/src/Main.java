import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int all = scan.nextInt();
            int jump = scan.nextInt();
            int remove = jump - 1;

            ArrayList<Integer> total = new ArrayList<>();
            for (int j = 1; j <= all; j++) {
                total.add(j);
            }
            while (total.size() != 1){
                 if(remove>=total.size()){
                     remove -= total.size();
                }
                 if(remove < total.size()){
                 }                     total.remove(remove);

            }
            System.out.println(total.get(0));
        }
    }
}
