
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Rect> figures = new ArrayList<Rect>();
        figures.add(new Rect(10, 10, 100, 100));
        figures.add(new Rect(400, 400, 100, 100));


        while (true){
            System.out.print("x: ");
            int x= scan.nextInt();
            System.out.print("y: ");
            int y = scan.nextInt();

            if((x == -1) && (y == -1)){
                break;
            }

            for(Rect r : figures){
                if(r.contains(x, y)){
                    System.out.println(r);
                }
            }

        }

    }
}
