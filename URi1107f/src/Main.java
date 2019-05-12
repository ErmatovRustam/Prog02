import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);


	while (true){
        int a = scan.nextInt();
        int b = scan.nextInt();

        if( a==0 && b == 0){
            break;
        }

        int prev = a;
        int count = 0;
        for(int i = 0; i< b; i++){
            int step = scan.nextInt();

            if(a - step > a- prev){
                count += ((a- step) - (a - prev));
            }
            prev = step;
        }
        System.out.println(count);


    }
    }
}
