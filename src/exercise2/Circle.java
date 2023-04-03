package exercise2;

/**
 *  A subclass of {@link AbstractShape} class. It defines a circle.
 * @author Panos V.
 * @version 1.0
 */
public class Circle extends AbstractShape implements ICircle{
    private final double radius;

    /**
     *  The overloaded Constructor.
     * @param id    The typical parameter for the id key.
     * @param radius    the typical parameter for the circle's radius.
     */
    public Circle(long id, double radius) {
        super(id);
        this.radius = radius;
    }

    /**
     *  Returns the diameter of the circle.
     * @return circle's diameter.
     */
    @Override
    public double getDiameter() {
        return radius * 2;
    }

    /**
     *  Returns the area of the circle.
     * @return  the value of circle's area.
     */
    @Override
    public double getArea() {
        return Math.PI * radius;
    }

    /**
     *  Returns the circumference (perimeter) of the shape.
     * @return  the value of shape's perimeter.
     */
    @Override
    public double getCircumference() {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     *  Converts the state of the object into a String.
     * @return  the state of the object.
     */
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + ", Id = " + this.getId() +
                '}';
    }
}
