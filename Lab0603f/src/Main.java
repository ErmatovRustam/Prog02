import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(new Rect(10, 10, 100, 100));
        figures.add(new Rect(400, 400, 100, 50));
        figures.add(new Circle(500, 15, 50));


        while (true) {

            System.out.print("X: ");
            int x = scan.nextInt();

            System.out.print("Y: ");
            int y = scan.nextInt();

            if (x == -1 && y == -1) {
                break;
            }

            for (Figure r : figures) {
                if (r.contains(x, y)) {
                    System.out.println(r);
                }
            }

        }
    }
}
