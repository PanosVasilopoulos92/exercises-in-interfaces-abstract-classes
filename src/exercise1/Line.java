package exercise1;

/**
 *  A subclass of {@link AbstractShape} class. It defines a line.
 *  @author Panos V.
 *  @version 1.0
 */
public class Line extends AbstractShape{
    private double length;

    /**
     *  The default constructor.
     */
    public Line () {
    }

    /**
     *  The overloaded Constructor.
     * @param length  The typical parameter for the line's length.
     */
    public Line(double length) {
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
     *  Sets the value of line's length.
     * @return the value of line's length.
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     *  Converts the state of the object into a String.
     * @return  a String that represents the state of the object-instance.
     */
    @Override
    public String toString() {
        return "Line{" +
                "length=" + length +
                '}';
    }
}
