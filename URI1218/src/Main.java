import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int time = 1;
        while (scan.hasNext()) {
            if(time!=1){
                System.out.println();
            }
            int sumM = 0;
            int sumF = 0;
            int sum = 0;

            ArrayList<String> arFM = new ArrayList<String>();
            ArrayList<Integer> arSize = new ArrayList<Integer>();
            int size = scan.nextInt();
            scan.nextLine();
            String box = scan.nextLine();
            String[] ar = box.split(" ");

            for(int i = 0; i<ar.length; i+=2){
                int sizeString = Integer.parseInt(ar[i]);
                arSize.add(sizeString);
            }
            for(int i = 1; i<ar.length; i+=2){
                arFM.add(ar[i]);
            }




            for (int i = 0; i < arFM.size(); i++) {

                if (arFM.get(i).equals("M") && arSize.get(i)==size) {
                    sumM++;
                }
                if (arFM.get(i).equals("F") && arSize.get(i)==size) {
                    sumF++;

                }
            }
            System.out.printf("Caso %d:\n", time);
            System.out.printf("Pares Iguais: %d\n", (sumF + sumM));
            System.out.printf("F: %d\n", sumF );
            System.out.printf("M: %d\n", sumM );

            time++;
        }
    }
}