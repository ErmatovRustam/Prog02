import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    static final int W = 20;
    static final int H = 20;
    static final char[][] field = new char[H][W];

    static final int UP = 0;
    static final int RIGHT = 1;
    static final int DOWN = 2;
    static final int LEFT = 3;

    static int turtleRow = 0;
    static int turtleCol = 0;
    static int turtleDir = RIGHT;  //not 1;
    static boolean turtlePenDown = false;

    static String command = "";
    static int dist = 0;
    static int nLines = 0;


    public static void main(String[] args) {
        try {
            run();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }


    static void run() {
        init();

        readUserCommand();

        while (!command.equals("exit")) {

            switch (command) {
                case "penup":
                    penUp();
                    break;
                case "pendown":
                    penDown();
                    break;
                case "turnright":
                    turnRight();
                    break;
                case "turnleft":
                    turnLeft();
                    break;
                case "move":
                    move(dist);
                    break;
                case "print":
                    print();
                    break;
            }
            readUserCommand();
        }
    }

    static void init() {
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                field[i][j] = '.';
            }
        }
    }

    static void print() {
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

    static void penDown() {
        turtlePenDown = true;
    }

    static void penUp() {
        turtlePenDown = false;
    }

    static void turnRight() {
        ++turtleDir;
        if (turtleDir == 4) {
            turtleDir = UP;
        }
    }

    static void turnLeft() {
        --turtleDir;
        if (turtleDir == -1) {
            turtleDir = LEFT;
        }
    }

    static void move(int d) {
        for (int i = 0; i < d; i++) {
            if (turtlePenDown) {
                field[turtleRow][turtleCol] = '*';
            }

            switch (turtleDir) {
                case UP:
                    --turtleRow;
                    break;
                case DOWN:
                    ++turtleRow;
                    break;
                case RIGHT:
                    ++turtleCol;
                    break;
                case LEFT:
                    --turtleCol;
                    break;
            }

            if (turtleRow < 0 || H <= turtleRow || turtleCol < 0 || W <= turtleRow) {
                throw new RuntimeException(
                        nLines + " Turtle is out of field: " + turtleRow + " , " + turtleCol);
            }
        }
    }

    static void readUserCommand() {
        String line = scan.nextLine().trim().toLowerCase();
        ++nLines;

        if (line.length() == 0) {
            command = "";
            dist = 0;
            return;
        }

        Scanner scan2 = new Scanner(line);
        command = scan2.next();
        switch (command) {
            case "penup":
            case "pendown":
            case "turnright":
            case "turnleft":
            case "move":
            case "print":
                break;
            default:
                command = "";
                throw new RuntimeException(nLines + " Incorrect Command");
        }

        if (command.equals("move")) {
            if (!scan2.hasNextLine()) {
                throw new RuntimeException(nLines + " no distanses");
            }
            dist = scan2.nextInt();

            if (dist < 0) {
                throw new RuntimeException(nLines + " negative distanses");
            }
            if (scan2.hasNext()) {
                throw new RuntimeException(nLines + " too many distanses");
            }
        }

    }
}