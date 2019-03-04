import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            String word = scan.nextLine().toUpperCase();
            int process = Integer.parseInt(scan.nextLine());
            int cycle = 0;
            char[] ar = word.toCharArray();
int counter  = 0;
            for (int i = 0; i < ar.length; i++) {

                if (ar[i] == 'R') {

                    if(counter == 0) {
                        cycle++;
                    }
                    counter++;


                    if(counter == process){
                        counter = 0;
                    }

                }else{
                    cycle++;
                    counter = 0;
                }
            }
            System.out.println(cycle);

        }
    }
}
