import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();
        ArrayList <String> ar = new ArrayList<>();

        for(int i = 0; i<n; i++){
            String word = scan.next();
            ar.add(word);


            for(int j = 0; j<ar.size() - 1; j++){
                if(ar.get(j).equals(word)){
                    ar.remove(ar.size() - 1);
                }
            }

        }
        System.out.println("Falta(m) " + (151 - ar.size()) + " pomekon(s).");
    }
}
