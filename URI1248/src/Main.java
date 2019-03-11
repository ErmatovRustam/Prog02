import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < n; i++) {
            String plan = scan.nextLine();
            String breakfast = scan.nextLine();
            String lunch = scan.nextLine();
            int[] let = new int[26];
            String word = "";
            int cheater = 0;

            for (int j = 0; j < plan.length(); j++) {
                let[(int) (plan.charAt(j) - 65)]++;
            }

            for (int k = 0; k < breakfast.length(); k++) {
                if (let[(int) (breakfast.charAt(k))] == 0) {
                    cheater = 1;
                }
            }
            for (int k = 0; k < lunch.length(); k++) {
                if (let[(int) (lunch.charAt(k))] == 0) {
                    cheater = 1;
                }
            }
            if (cheater == 1) {
                System.out.println("CHEATER");
            } else if (plan.length()==0 && breakfast.length() > 0 || lunch.length() > 0) {
                System.out.println("CHEATER");
            }  else if (plan.isEmpty()) {
                System.out.println();
            }else






            System.out.println();

        }
    }
}
