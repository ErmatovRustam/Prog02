import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Rect> figures = new ArrayList<Rect>();
        figures.add(new Rect(10, 10, 100, 100));
        figures.add(new Rect(400, 400, 100, 100));

        ArrayList<Circle> figures2 = new ArrayList<Circle>();
        figures2.add(new Circle(500, 10, 100));
        figures2.add(new Circle(800, 800, 100));





        while (true) {
            System.out.print("x: ");
            int x = scan.nextInt();
            System.out.print("y: ");
            int y = scan.nextInt();

            if ((x == -1) && (y == -1)) {
                break;
            }

            for (Rect r : figures) {
                if (r.contains(x, y)) {
                    System.out.println(r);
                }
            }
            for (Circle c : figures2) {
                if (c.contains(x, y)) {
                    System.out.println(c);
                }
            }
        }


    }
}
