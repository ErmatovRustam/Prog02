import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            String word = scan.nextLine();
            char[] ar = word.toCharArray();
            int space = 0;
            int length = ar.length;
            for (int i = 0; i < ar.length; i++) {


                for (int s = 0; s < space; s++)
                    System.out.print(" ");

                space++;

                for(int k = 0; k<length;k++){
                    System.out.print(ar[k]);

                    if(k<length-1){
                        System.out.print(" ");
                    }
                }
                System.out.println();
                length--;

            }
            System.out.println();
        }
    }
}
