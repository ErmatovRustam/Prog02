import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String word = scan.nextLine().toUpperCase();
            int n = Integer.parseInt(scan.nextLine());
            char[] ar = word.toCharArray();
            int counter = 0;
            int cycle = 0;

            for(int i = 0; i<ar.length; i++){
                if(ar[i]=='R'){

                    if(counter==0){
                        cycle++;
                    }
                        counter++;

                    if(counter==n){
                        counter=0;
                    }

                }else{
                    counter =0;
                    cycle++;
                }
            }
            System.out.println(cycle);
        }
        }
    }
