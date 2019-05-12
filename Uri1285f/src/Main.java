import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for (int i = 0; i < a; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();

            int size = x;
            int[] mans = new int[size];
            for (int j = 0; j < x; j++) {
                mans[j] = j+1;
            }
            int c = 0;
            int j = y;
            while (j > x){
                j -= x;
            }
            while (c != x-1) {
                remove(mans,size,(j-1));
                size--;
                j--;
                if (j + y > size) {
                    j = j + y - size;
                    while (j > size){
                        j -= size;
                    }
                } else {
                    j += y;
                }
                c++;
            }
            System.out.println("Case " + (i + 1) + ": " + mans[0]);
        }
    }
    private static void remove(int[] mans, int size, int ind){
        for (int i = ind; i < size-1; i++){
            mans[i] = mans[i+1];
        }
    }
}