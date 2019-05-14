import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean ch = true;

        do {
            try {
                System.out.print("N: ");
                int n = scan.nextInt();
                System.out.println("The number is: " + n);
                ch = false;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect: integer plese");
                scan.nextLine();
            }

        } while (ch);
    }
}
