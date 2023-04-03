package exercise2;

/**
 *  A subclass of {@link AbstractShape} class. It defines a line.
 *  @author Panos V.
 *  @version 1.0
 */
public class Line extends AbstractShape implements ILine{
    private final double length;

    /**
     *  The overloaded Constructor.
     * @param id    The typical parameter for the id key.
     * @param length    The typical parameter for the line's length.
     */
    public Line(long id, double length) {
        super(id);
        this.length = length;
    }

    /**
     *  Gets the value of line's length.
     * @return the value of line's length.
     */
    public double getLength() {
        return length;
    }

    /**
     *  Converts the state of the object into a String.
     * @return  a String that represents the state of the object-instance.
     */
    @Override
    public String toString() {
        return "Line{" +
                "length=" + length + ", Id = " + this.getId() +
                '}';
    }
}
