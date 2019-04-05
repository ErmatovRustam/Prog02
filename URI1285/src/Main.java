import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int begNum = scan.nextInt();
            int endNum = scan.nextInt();
            int diff = endNum - begNum;
            String[] ar = new String[diff+1];
            int k = 0;
            int counter = 0;
            for (int i = begNum; i <= endNum; i++) {
                ar[k] = Integer.toString(i);
                k++;
            }

            for (int i = 0; i < ar.length; i++) {


                for (int j = 0; j < ar[i].length() - 1; j++) {
                    for (int o = j + 1; o < ar[i].length(); o++) {
                        if (ar[i].charAt(j) == ar[i].charAt(o)) {
                            ar[i] = "55555";
                        }
                    }
                }
            }

            for (int l = 0; l < ar.length; l++) {
                if (ar[l].equals("55555")) {
                    counter++;
                }
            }
            System.out.println(diff - counter + 1);

        }
    }
}
