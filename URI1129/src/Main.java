import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        while (n != 0) {
            scan.nextLine();
            String[] ar = new String[5];

            for (int i = 0; i < n; i++) {
                int noAnswer = 0;
                int moreAnswer = 0;
                String line = scan.nextLine();
                ar = line.split(" ");

                for (int j = 0; j < ar.length; j++) {
                    int num = Integer.parseInt(ar[j]);
                    if (num <= 127) {
                        moreAnswer++;
                    } else {
                        noAnswer++;
                    }
                }

                if (noAnswer == 5 || moreAnswer > 1) {
                    System.out.println("*");
                } else {
                    for (int j = 0; j < ar.length; j++) {
                        int num = Integer.parseInt(ar[j]);
                        if (num <= 127) {
                            switch (j) {
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
