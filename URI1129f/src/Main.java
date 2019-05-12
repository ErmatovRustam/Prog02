import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        while (n != 0) {
            scan.nextLine();
            String[] ar = new String[5];

            for (int k = 0; k < n; k++) {
                int noAnswer = 0;
                int moreAnswer = 0;
                String word = scan.nextLine();
                ar = word.split(" ");

                for (int v = 0; v < ar.length; v++) {
                    int num = Integer.parseInt(ar[v]);
                    if (num <= 127) {
                        moreAnswer++;
                    } else {
                        noAnswer++;
                    }
                }


                if (noAnswer == 5 || moreAnswer > 1) {
                    System.out.println("*");
                } else {
                    for (int l = 0; l < ar.length; l++) {
                        int num = Integer.parseInt(ar[l]);

                        if (num <= 127) {
                            switch (l) {
                                case 0:
                                    System.out.println("A");
                                    break;
                                case 1:
                                    System.out.println("B");
                                    break;
                                case 2:
                                    System.out.println("C");
                                    break;
                                case 3:
                                    System.out.println("D");
                                    break;
                                case 4:
                                    System.out.println("E");
                                    break;

                            }
                        }

                    }


                }


            }
            n = scan.nextInt();
        }
    }
}