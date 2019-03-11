import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {

            try {
                System.out.println("1st Rational: ");
                if (!scan.hasNextLine()) break;
                Rational a = Rational.parse(scan.nextLine().trim());

                System.out.println("operation ");
                if (!scan.hasNextLine()) break;
                String op = scan.nextLine().trim();


                System.out.print("2nd rational: ");
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
                        System.out.println("Incorrect operator: " + op);
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Incorrect Rational");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}