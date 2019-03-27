import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (; ; ) {
            String a = scan.next();
            String b = scan.next();

            if (a.equals("0") && b.equals("0")) {
                break;
            } else {
                b = b.replace(a, "");

                if (b.isEmpty()) {
                    System.out.println("0");
                } else {
                    try{
                    int finInt = Integer.parseInt(b);
                    String finAn = Integer.toString(finInt);
                        System.out.println(finAn);}
                        catch (NumberFormatException e){
                            System.out.println(b);
                        }

                }

                }
            }
        }
    }