

public class Main {

    public static void main(String[] args) {

        try {
            Circle circle1 = new Circle(5);
            Circle circle2 = new Circle(5);
            Circle circle3 = new Circle(1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Created Objects: " + Circle.getNumberO());
    }
}