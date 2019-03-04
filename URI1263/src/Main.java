import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextLine()) {
            String line = scan.nextLine().toLowerCase();
            int sum = 0;

            String[] ar = line.split(" ");
            boolean check = false;

            for (int i = 0; i < ar.length - 1; i++) {

                if(ar[i].charAt(0) == ar[i+1].charAt(0) ){

                    if(!check){
                        sum++;
                        check = true;
                    }
                }
                else{
                    check = false;
                }
            }
            System.out.println(sum);
        }
    }
}
