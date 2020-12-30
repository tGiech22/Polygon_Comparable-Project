
/**
 * Write a description of class Hexagon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hexagon extends Agon
{
    public Hexagon()
    {
        super();
    }
    public Hexagon(int sides, double length)
    {
        super(sides, length);
    }
    
    public String getMyType()
    {
        return "Hexagon";
    }
    
    public String toString()
    {
        return "Hexagon and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
