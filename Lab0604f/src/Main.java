import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Figure> figures = Utils.createFigures();

        while (true)
        {
            System.out.print("cmd: ");
            String cmd = scan.next();

            if (cmd.equals("stop")) {
                break;
            } else if (cmd.equals("click")) {
                System.out.print("x: ");
                int x = scan.nextInt();
                System.out.print("y: ");
                int y = scan.nextInt();
                for (Figure f: figures) {
                    if (f.contains(x, y)) {
                        System.out.println(f);
                    }
                }
            } else if (cmd.equals("move")) {
                System.out.print("x1: ");
                int x1 = scan.nextInt();
                System.out.print("y1: ");
                int y1 = scan.nextInt();
                System.out.print("x2: ");
                int x2 = scan.nextInt();
                System.out.print("y2: ");
                int y2 = scan.nextInt();
                for (Figure f: figures) {
                    if (f.contains(x1, y1)) {
                        f.move(x2 - x1, y2 - y1);
                    }
                }
            } else if (cmd.equals("showAll")) {
                for (Figure f: figures) {
                    System.out.println(f);
                }
            }
        }
    }
}