package exercise2;

/**
 *  A skeletal implementation class that implements the Interface {@link IShape}.
 * @author Panos V.
 * @version 1.0
 */
public abstract class AbstractShape implements IShape{
    private long id;

    /**
     *  The overloaded Constructor.
     * @param id the typical parameter for the id key.
     */
    public AbstractShape(long id) {
        this.id = id;
    }

    /**
     *  Returns the id key of the {@link IShape}.
     * @return  the id key.
     */
    @Override
    public long getId() {
        return id;
    }

    /**
     *  Sets the value of the id key.
     * @return  the value of the id key.
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     *  Converts the state of the object into a String.
     * @return  the state of the object.
     */
    @Override
    public String toString() {
        return "AbstractShape{" +
                "id=" + id +
                '}';
    }
}
