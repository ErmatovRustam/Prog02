import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int k = 1;
            int sum = 0;
            String line = scan.next();
            char[] ar = line.toCharArray();

            for(int j = 0; j<ar.length; j++){
                if(ar[j]=='A' || ar[j]=='E' || ar[j]=='I' || ar[j]=='O' || ar[j]=='S' ||
                        ar[j]=='a' || ar[j]=='e' || ar[j]=='i' || ar[j]=='o' || ar[j]=='s'){
                    k *=3;
                }else{
                    k *=2;
                }
            }
            System.out.println(k);
        }



    }
}
