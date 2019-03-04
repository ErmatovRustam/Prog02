import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (a == 0 && b == 0) {
                break;
            } else {
                int c = a + b;
                String s = Integer.toString(c);
                s = s.replace("0", "");
                System.out.println(s);
            }
        }
    }
}
