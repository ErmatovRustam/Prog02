import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("1st Rational: ");
                if (!scan.hasNextLine()) break;
                Rational a = Rational.parse(scan.nextLine().trim());

                System.out.print("Opertation: ");
                if (!scan.hasNextLine()) break;
                String op = scan.nextLine();

                System.out.print("2nd Rational: ");
                if (!scan.hasNextLine()) break;
                Rational b = Rational.parse(scan.nextLine().trim());

                switch (op) {
                    case "+":
                        System.out.println(a.add(b));
                        break;
                    case "-":
                        System.out.println(a.substract(b));
                        break;
                    case "*":
                        System.out.println(a.multiply(b));
                        break;
                    case "/":
                        System.out.println(a.divide(b));
                        break;
                        default:
                            System.out.println("incorrect operation");
                            break;

                }

            }catch (NumberFormatException e){
                System.out.println("Incorrect Rational");
            }catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
            System.out.println();
        }
    }
}