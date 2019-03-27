import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            String word = scan.nextLine();
            char[] ar = word.toCharArray();

            for (int j = 0; j < ar.length; j++) {
                switch (ar[j]) {
                    case '0':
                        sum += 6;
                        break;
                    case '1':
                        sum += 2;
                        break;
                    case '2':
                        sum += 5;
                        break;
                    case '3':
                        sum += 5;
                        break;
                    case '4':
                        sum += 4;
                        break;
                    case '5':
                        sum += 5;
                        break;
                    case '6':
                        sum += 6;
                        break;
                    case '7':
                        sum += 3;
                        break;
                    case '8':
                        sum += 7;
                        break;
                    case '9':
                        sum += 6;
                        break;
                }

            }
            System.out.println(sum + " leds");
        }
    }
}
