public class Circle {
    private double radius;
    private static int numberOfObjects = 0;
    public Circle() {
        this(1.0);
    }
    public Circle(double newRadius) {
        setRadius(newRadius);
        numberOfObjects++;
    }

    public void setRadius(double newRadius)
            throws InvalidRadiusException {
        if (newRadius >= 0)
            radius = newRadius;
        else
            throw new InvalidRadiusException(
                    "Radius cannot be negative");
    }

    public static int getNumberO() {
        return numberOfObjects;
    }
    public double findArea() {
        return radius * radius * 3.14159;
    }
}
