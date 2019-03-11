import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static final int H = 20;
    static final int W = 20;
    static char[][] data = new char[H][W];

    static final int UP = 0;
    static final int RIGHT = 1;
    static final int DOWN = 2;
    static final int LEFT = 3;

    static int turtleRow = 0;
    static int turtleCol = 0;
    static int turtleDir = RIGHT;
    static boolean turtlePenDown = false;

    static int nLines = 0;
    static int dist = 0;
    static String command = "";


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
                data[i][j] = '.';
            }
        }
    }

    static void print() {
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(data[i][j]);
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
        for (int i = 0; i < d; ++i) {
            if (turtlePenDown) {
                data[turtleRow][turtleCol] = '*';
            }
            switch (turtleDir) {
                case UP:
                    --turtleRow;
                    break;
                case RIGHT:
                    ++turtleCol;
                    break;
                case DOWN:
                    ++turtleRow;
                    break;
                case LEFT:
                    --turtleCol;
                    break;
            }
            if (turtleCol > W || turtleCol < 0 || turtleRow > H || turtleRow < 0) {
                throw new RuntimeException(" Incorrect hight or width: " + nLines);
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
            case "exit":
                break;
            default:
                command = "";
                throw new RuntimeException(nLines + " Incorrect command");
        }

        if (command.equals("move")) {
            if (!scan2.hasNext()) {
                throw new RuntimeException("Incorrect distance");
            }
            dist = scan2.nextInt();

            if (dist < 0) {
                throw new RuntimeException("Negative Distance");
            }
            if (scan2.hasNext()) {
                throw new RuntimeException("Too many arguments");
            }
        }

    }
}
