
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends Rounds
{
    public Circle()
    {
        super();
    }
    public Circle(double radius)
    {
        super(radius);
    }
    
    public String getMyType()
    {
        return "Circle";
    }
    
    public String toString()
    {
        return "Circle and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
