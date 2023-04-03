package exercise2;

/**
 *  A subclass of {@link AbstractShape} class. It defines a rectangle.
 *  @author Panos V.
 *  @version 1.0
 */
public class Rectangle extends AbstractShape implements IRectangle{
    private final double width;
    private final double height;

    /**
     *  The overloaded Constructor.
     * @param id    The typical parameter for the id key.
     * @param width The typical parameter for the rectangle's width.
     * @param height    The typical parameter for the rectangle's height.
     */
    public Rectangle(long id,double width, double height) {
        super(id);
        this.width = width;
        this.height = height;
    }

    /**
     *  Returns the area of the shape.
     * @return  the value of shape's area.
     */
    @Override
    public double getArea() {
        return width * height;
    }

    /**
     *  Returns the circumference (perimeter) of the shape.
     * @return  the value of shape's perimeter.
     */
    @Override
    public double getCircumference() {
        return (width * 2) + (height * 2);
    }

    /**
     *  Converts the state of the object into a String.
     * @return  the state of the object.
     */
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
