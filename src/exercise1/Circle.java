package exercise1;

/**
 *  A subclass of {@link AbstractShape} class. It defines a circle.
 *  @author Panos V.
 *  @version 1.0
 */
public class Circle extends AbstractShape implements ITwoDimensional{
    private double radius;

    /**
     *  The default Constructor.
     */
    public Circle() {
    }

    /**
     *  The overloaded Constructor.
     * @param radius the typical parameter for the circle's radius.
     */
    public Circle(double radius){
        this.radius = radius;
    }

    /**
     *  A method for getting the area of the circle.
     * @return  The circle's area.
     */
    @Override
    public double getArea() {
        return Math.PI * radius;
    }
}
