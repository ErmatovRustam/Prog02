import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {

            int studentN = scan.nextInt();
            String[] ar1 = new String[studentN];
            String[] ar2 = new String[studentN];

            for (int j = 0; j < studentN; j++) {
                ar1[j] = scan.next();
            }
            boolean check = false;
            for (int j = 0; j < studentN; j++) {
                ar2[j] = scan.next().toUpperCase();
                int p = 0;
                int m = 0;
                int a = 0;

                for(int k = 0; k<ar2[j].length(); k++){
                    if(ar2[j].charAt(k)=='P'){
                        p++;
                    }
                    else if(ar2[j].charAt(k)=='M'){
                        m++;
                    }
                    else if(ar2[j].charAt(k)=='A'){
                        a++;
                    }
                }
                int sum = 100 * p / (p +a);

                if (sum < 75) {
                    System.out.print((!check ? "" : " ") + ar1[j]);
                    check = true;
                }
            }
            System.out.println();
        }
    }
}