import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Rect> figures = new ArrayList<Rect>();
        figures.add(new Rect(10, 10, 100, 100));
        figures.add(new Rect(400, 400, 100, 50));



        while(true) {

            System.out.print("X: ");
            int x = scan.nextInt();

            System.out.print("Y: ");
            int y = scan.nextInt();

            if (x == -1 && y == -1) {
                break;
            }

            for (Rect r : figures) {
                if (r.contains(x, y)){
                    System.out.println(r);
                }
            }

        }
    }
}
