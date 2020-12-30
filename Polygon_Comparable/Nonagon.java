
/**
 * Write a description of class Nonagon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nonagon extends Agon
{
    public Nonagon()
    {
        super();
    }
    public Nonagon(int sides, double length)
    {
        super(sides, length);
    }
    
    public String getMyType()
    {
        return "Nonagon";
    }
    
    public String toString()
    {
        return "Nonagon and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
