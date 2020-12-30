
/**
 * Write a description of class Dodecagon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dodecagon extends Agon
{
    public Dodecagon()
    {
        super();
    }
    public Dodecagon(int sides, double length)
    {
        super(sides, length);
    }
    
    public String getMyType()
    {
        return "Dodecagon";
    }
    
    public String toString()
    {
        return "Dodecagon and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
