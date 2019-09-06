public class Main {

    public static void main(String[] args) {
	    Circle circle = new Circle(1);
	    circle.setFilled("black");
        System.out.println("A circle "+circle.toString());
        Rectangle rectangle = new Rectangle();
        rectangle.setFilled("Red");
        System.out.println("A rectangle " + rectangle.toString());
    }
}
