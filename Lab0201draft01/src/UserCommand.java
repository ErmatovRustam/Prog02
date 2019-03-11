import java.util.Scanner;

public class UserCommand {
    private String name;
    private int dist;

    public UserCommand(Scanner scan){
        String line = scan.nextLine().trim().toLowerCase();
        name = "";

        if(line.length()==0){
            return;
        }
        Scanner scan2 = new Scanner(line);
        name = scan2.next();
        switch (name){
            case "penup":
            case "pendown":
            case "turnright":
            case "turnleft":
            case "print":
            case "move":
            case "exit":
                break;
                default:
                    throw new RuntimeException("Incorrect command");
        }
        if(name.equals("move")){
            if(!scan2.hasNext()){
                throw new RuntimeException("Distance is not specified");
            }
            dist = scan2.nextInt();
            if(dist<0){
                dist = 0;
                throw new RuntimeException("Negative Distance");
            }
            if(scan2.hasNext()){
                throw new RuntimeException("Too many arguments");
            }
        }

    }
    public String getName(){
        return name;
    }
    public int getDist(){
        return dist;
    }


}
