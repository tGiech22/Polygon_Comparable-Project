
/**
 * Write a description of class Octagon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Octagon extends Agon
{
    public Octagon()
    {
        super();
    }
    public Octagon(int sides, double length)
    {
        super(sides, length);
    }
    
    public String getMyType()
    {
        return "Octagon";
    }
    
    public String toString()
    {
        return "Octagon and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
