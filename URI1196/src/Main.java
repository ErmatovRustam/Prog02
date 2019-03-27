import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        String key = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./`";
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            for (int i = 0; i < line.length(); ++i) {

                if (line.charAt(i) == ' ') {
                    System.out.print(' ');
                } else {
                    int index = key.indexOf(line.charAt(i));
                    System.out.print(key.charAt(index - 1));
                    /*/*sdgsdgvsdgv*/*/
                }
            }
            System.out.println();
        }
    }
}
