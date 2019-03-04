import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            Field field = new Field(20, 20);

            Turtle turtle = new Turtle(field, 0, 0, Turtle.RIGHT);
            turtle.setPenDown();
            turtle.move(30);
            field.print();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public void run(){
        Field field = new Field(20,20);
        Turtle turtle = new Turtle(field,0,0, Turtle.RIGHT);

        UserCommand cmd = new Usercomand(scan);
        while(cmd.getName().equals("exit")){
            switch (cmd.getName){
                case "penup":
                    turtle.penUP();
            }
        }

    }
}
