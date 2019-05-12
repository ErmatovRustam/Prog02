import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int time = scan.nextInt();

        for (int i = 0; i < time; i++) {
            int n = scan.nextInt();
            ArrayList<Integer> ar = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int line = scan.nextInt();
                boolean ch = true;
                    for (int a = 0; a < ar.size(); a++) {
                        if (ar.get(a) == line) {
                           ch= false;
                        }
                    }
                    if(ch){
                        ar.add(line);
                }
            }
            System.out.println(ar.size());
        }
    }
}
