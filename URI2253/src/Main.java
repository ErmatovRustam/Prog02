import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextLine()) {
            int sumU = 0;
            int sumL = 0;
            int sumIn = 0;
            int sum = 0;
            int incorrect = 0;
            String password = scan.nextLine();
            char[] ar = password.toCharArray();

            for (int i = 0; i < ar.length; i++) {

                if ((int) ar[i] >= 65 && (int) ar[i] <= 90) {
                    sumU++;
                } else if ((int) ar[i] >= 97 && (int) ar[i] <= 122) {
                    sumL++;
                } else if ((int) ar[i] >= 48 && (int) ar[i] <= 57) {
                    sumIn++;
                } else if ((int) ar[i] >= 32 && (int) ar[i] <= 47 || (int) ar[i] >= 58 && (int) ar[i] <= 64 ||
                        (int) ar[i] >= 91 && (int) ar[i] <= 96 ||(int) ar[i] >= 123 && (int) ar[i] <= 126 ) {
                    incorrect++;

                }
            }
            sum = sumIn + sumL + sumU;
            if (sumU > 0 && sumIn > 0 && sumL > 0 && sum >= 6 && sum <= 32 && incorrect == 0){
                System.out.println("Senha valida.");
            } else {
                System.out.println("Senha invalida.");
            }


        }
    }
}
