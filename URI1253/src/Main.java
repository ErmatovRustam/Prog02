import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            String a = scan.next();
            int length = a.length();
            int sum = 0;
            int orderN = 0;
            while (orderN < length) {
                char r = a.charAt(orderN);
                switch (r) {
                    case '0':
                    case '6':
                    case '9':
                        sum += 6;
                        break;
                    case '1':
                        sum += 2;
                        break;
                    case '2':
                    case '5':
                    case '3':
                        sum += 5;
                        break;
                    case '4':
                        sum += 4;
                        break;
                    case '7':
                        sum += 3;
                        break;
                    case '8':
                        sum += 7;
                        break;
                }

                increaseOrder(orderN);




            }
            System.out.println(sum + " leds");


        }

           }

    private static int increaseOrder(int a) {

        a++;
        return a;
    }
}
