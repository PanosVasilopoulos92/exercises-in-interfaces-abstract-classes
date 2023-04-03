package exercise1;

/**
 *  A subclass of {@link AbstractShape} class. It defines a rectangle.
 *  @author Panos V.
 *  @version 1.0
 */
public class Rectangle extends AbstractShape implements ITwoDimensional {
    private double width;
    private double height;

    /**
     *  The default Constructor.
     */
    public Rectangle() {
    }

    /**
     *  The overloaded Constructor.
     * @param width   The typical parameter for the rectangle's width.
     * @param height   The typical parameter for the rectangle's height.
     */
    public Rectangle(double width, double height) {
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
}
