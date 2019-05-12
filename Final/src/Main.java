import java.util.*;
2
        3 public class InputMismatchExceptionDemo {
4 public static void main(String[] args) {
        5 Scanner input = new Scanner(System.in);
        6 boolean continueInput = true;
        7
        8 do {
            9 try {
                10 System.out.print("Enter an integer: ");
                11 int number = input.nextInt();
                12
                13 // Display the result
                14 System.out.println(
                        15 "The number entered is " + number);
                16
                17 continueInput = false;
                18 }
            19 catch (InputMismatchException ex) {
                20 System.out.println("Try again. (" +
                        21 "Incorrect input: an integer is required)");
                22 input.nextLine(); // Discard input
                23 }
            24 } while (continueInput);
        25 }
26 }