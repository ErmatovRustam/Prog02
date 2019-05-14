public class Main {

    public static void main(String[] args) {
	try{

	    Circle c1 = new Circle(5);
	    Circle c2 = new Circle(-5);

    }catch (Inva e){
        System.out.println(e.getMessage());
    }
        System.out.println("Done: " + Circle.getN());
    }
}
