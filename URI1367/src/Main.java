import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        while (n != 0) {
            int correct = 0;
            int resultMin = 0;
            int counter = 0;
            int fin = 0;
            String letter = "";
            String[] arT = new String[n];
            int[] arMinut = new int[n];
            String[] arAn = new String[n];
            int[] count = new int[26];

            for (int i = 0; i < n; i++) {
                arT[i] = scan.next();
                arMinut[i] = scan.nextInt();
                arAn[i] = scan.next();
            }
            for (int j = 0; j < n; j++) {

                int q = arT[j].charAt(0) - 65;

                if (arAn[j].equals("correct")) {
                    correct++;
                    resultMin += arMinut[j] + count[q] * 20;
                }
                else
                {
                    count[q]++;
                }



//                if (arAn[j].equals("correct") && j != 0 && arT[j - 1].equals(arT[j])) {
//                    // resultMin += 20;
//                    letter = arT[j];
//                    fin++;
//                    for (int i = j; i >= 0; i--) {
//                        if (letter.equals(arT[i])) {
//                            counter++;
//                        }
//                    }
//                }
            }
            System.out.println(correct + " " + resultMin);
            n = scan.nextInt();
        }
        }
    }

