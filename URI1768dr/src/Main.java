import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){
            int n = scan.nextInt();
            int space = n / 2;

            for(int i = 1; i<=n; i+=2){
                for(int j = 0; j<space; j++){
                    System.out.print(" ");
                }

                for(int k = 0; k<i; k++){
                    System.out.print("*");
                }
                space--;
                System.out.println();
            }

            space = n / 2;

            for( int j = 0; j<space; j++){
                System.out.print(" ");
            }
            System.out.println("*");
            for( int j = 0; j<space-1; j++){
                System.out.print(" ");
            }
            System.out.println("***");
            System.out.println();
        }
    }
}
