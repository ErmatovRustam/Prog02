import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int origin = 0;
            int orderN = scan.nextInt();
            int[] word = new int[orderN];
            scan.nextLine();

            for (int j = 0; j < orderN; j++) {
                String line = scan.nextLine();
                if (line.equals("LEFT")) {
                    word[j] = 555;
                    origin--;
                } else if (line.equals("RIGHT")) {
                    word[j] = 999;
                    origin++;
                } else {
                    int index = 0;
                    for (int k = 0; k < line.length(); k++) {
                        index = line.indexOf("E");
                    }
                    int num = Integer.parseInt(line.substring(index + 5));
                    if (word[num - 1] == 555) {
                        origin--;
                        word[j] = 555;
                    } else if (word[num - 1] == 999) {
                        origin++;
                        word[j] = 999;
                    }

                }
            }
            System.out.println(origin);
        }
    }
}
