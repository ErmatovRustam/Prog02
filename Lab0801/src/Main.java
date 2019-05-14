import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean check = true;

        do{
            try{
                System.out.print("Integer: ");
                int n = scan.nextInt();
                System.out.println("Number is: " + n);
                check = false;
            }catch (Exception e) {
                System.out.println("Incoreect");
                scan.nextLine();
            }
        }while (check);
    }
}
