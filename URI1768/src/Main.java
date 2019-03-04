import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            int base = n / 2;
            for (int i = 0; i < base; i++) {
                System.out.print(" ");
            }
        }
    }


}


//import java.util.*;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        while (scan.hasNext()) {
//            int n = scan.nextInt();
//            int l1 = 0, l2 = n / 2;
//            for (int i = 1; i <= n; i += 2) {
//                l1 = (n - i) / 2;
//                String s = new String();
//                for (int j = 0; j < l1; j++)
//                    s += " ";
//                for (int j = 0; j < i; j++)
//                    s += "*";
//                System.out.println(s);
//            }
//            for (int i = 1; i <= 3; i += 2, l2--) {
//                String s = new String();
//                for (int j = 0; j < l2; j++)
//                    s += " ";
//                for (int j = 0; j < i; j++)
//                    s += "*";
//                System.out.println(s);
//            }
//            System.out.println();
//        }
//    }
//}