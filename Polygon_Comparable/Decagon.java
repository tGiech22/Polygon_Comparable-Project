
/**
 * Write a description of class Decagon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Decagon extends Agon
{
    public Decagon()
    {
        super();
    }
    public Decagon(int sides, double length)
    {
        super(sides, length);
    }
    
    public String getMyType()
    {
        return "Decagon";
    }
    
    public String toString()
    {
        return "Decagon and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
