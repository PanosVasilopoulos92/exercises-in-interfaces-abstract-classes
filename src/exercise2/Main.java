package exercise2;

/**
 *  This class implements instances-objects of other classes (Composition) and test their functionality.
 *  @author Panos V.
 *  @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(12, 12);     // The instantiation of the "circle" object, of type Circle.
        Rectangle rectangle = new Rectangle(2, 20,60);
        Line line = new Line(3, 24);

        System.out.println(line);

        System.out.println(circle.getCircumference());

        System.out.println(rectangle);

        System.out.println(circle.getId());

        System.out.printf("%.2f cm^2",circle.getArea());

    }
}
