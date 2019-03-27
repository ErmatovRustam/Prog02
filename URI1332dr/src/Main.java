import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            String word = scan.next();
            char[] ar = word.toCharArray();


                if (ar[0] == 'o' && ar[1] == 'n' || ar[1] == 'n' && ar[2] == 'e' || ar[2] == 'e' && ar[0] == '0') {
                    System.out.println("1");
                }
                else if (ar[0] == 't' && ar[1] == 'w' || ar[1] == 'w' && ar[2] == 'o' || ar[2] == 'o' && ar[0] == 't') {
                    System.out.println("2");
                }
               else if (ar[0] == 't' && ar[1] == 'h' && ar[2]== 'r' && ar[3]=='e' ||
                        ar[0] == 't' && ar[1] == 'h' && ar[2]== 'r' && ar[4]=='e' ||
                        ar[0] == 't' && ar[1] == 'h' && ar[4]== 'e' && ar[3]=='e' ||
                        ar[0] == 't' && ar[4] == 'e' && ar[2]== 'r' && ar[3]=='e' ||
                        ar[4] == 'e' && ar[1] == 'h' && ar[2]== 'r' && ar[3]=='e'
                ){
                   System.out.println("3");

            }
        }
    }
}
