
/**
 * Write a description of class Septagon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Septagon extends Agon
{
    public Septagon()
    {
        super();
    }
    public Septagon(int sides, double length)
    {
        super(sides, length);
    }
    
    public String getMyType()
    {
        return "Septagon";
    }
    
    public String toString()
    {
        return "Septagon and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
