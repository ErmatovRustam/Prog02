import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < n; i++) {
            String word = scan.next();
            char[] ar = word.toCharArray();
            if (ar.length == 3) {

                if (ar[0] == 'U' && ar[1] == 'R') {
                    ar[2] = 'I';
                    if(i==n-1){
                        System.out.println("URI");
                        break;}
                    System.out.print("URI ");
                } else if (ar[0] == 'O' && ar[1] == 'B') {
                    ar[2] = 'I';
                    if(i==n-1){
                        System.out.println("OBI");
                        break;}
                    System.out.print("OBI ");
                } else {
                    if(i==n-1){
                        System.out.println(word);
                        break;}
                    System.out.print(word + " ");

                }
            } else {
                if(i==n-1){
                    System.out.println(word);
                    break;
                }
                System.out.print(word + " ");

            }
        }
    }
}
