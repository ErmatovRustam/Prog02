import java.util.Scanner;
public class Main {
    static Scanner scan = new Scanner(System.in);
    static int nLines = 0;
    public static void main(String[] args) {
        try {
            run();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void run() {
        Field field = new Field(20, 20);
        Turtle turtle = new Turtle(field, 0, 0, Turtle.RIGHT);
        ++nLines;

        UserCommand cm = new UserCommand(scan);

        while (!cm.getName().equals("exit")) {
            switch (cm.getName()) {
                case "penup":
                    turtle.PenUp();
                    break;
                case "pendown":
                    turtle.PenDown();
                    break;
                case "turnright":
                    turtle.turnRight();
                    break;
                case "turnleft":
                    turtle.turnLeft();
                    break;
                case "move":
                    turtle.move(cm.getDist());
                    break;
                case "print":
                    field.print();
                    break;
            }
            ++nLines;
            cm = new UserCommand(scan);
        }

    }

}
