import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> a = new ArrayList<Integer>();

        while(scan.hasNext()){
            int x = scan.nextInt();
            a.add(x);
        }
        System.out.println(a);

        for(int i = 0; i<a.size();++i){
            if(a.get(i) % 2==0){
                a.add(i,0);
                ++i;
            }
        }
    }
}
