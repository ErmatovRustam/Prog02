import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        while (n1 != 0 && n2 != 0) {

            int[] arr = new int[n2];
            for (int i = 0; i < n2; i++) {
                arr[i] = scan.nextInt();
            }

            Arrays.sort(arr);

            ArrayList<Integer> arL = new ArrayList<>();

            for (int j = 0; j < n2; j++) {
                arL.add(arr[j]);
                for(int k = j+1; k < n2; k++){
                    arL.add(arr[k] - arr[j]);
                }
            }

            int[] newArr = new int[arL.size()];

            for(int l = 0; l < arL.size(); l++){
                newArr[l] = arL.get(l);
            }
            Arrays.sort(newArr);

            for(int r = 0; r< arL.size(); r++){
                arL.set(r, newArr[r]);
            }

            for(int m = 1; m< arL.size(); m++){
                if(arL.get(m) == arL.get(m-1)){
                    arL.remove(m);
                    m--;
                }
            }

            System.out.println(arL.size() == n1 + 1 ? "Y" : "N");


            n1 = scan.nextInt();
            n2 = scan.nextInt();

        }
    }
}
