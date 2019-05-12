import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(new Rect(10, 10, 100, 100));
        figures.add(new Rect(500, 500, 1000, 100));
        figures.add(new Circle(500, 10, 100));
        figures.add(new Circle(800, 800, 100));

        while (true) {
            System.out.print("x: ");
            int x = scan.nextInt();
            System.out.print("y: ");
            int y = scan.nextInt();

            if (x == -1 && y == -1) {
                break;
            }

            for (Figure f : figures) {
                if (f.contains(x, y)) {
                    System.out.println(f);
                }
            }

        }
    }
}