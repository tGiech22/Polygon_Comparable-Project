
/**
 * Write a description of class Pentagon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pentagon extends Agon
{
    public Pentagon()
    {
        super();
    }
    public Pentagon(int sides, double length)
    {
        super(sides, length);
    }
    
    public String getMyType()
    {
        return "Pentagon";
    }
    
    public String toString()
    {
        return "Pentagon and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
