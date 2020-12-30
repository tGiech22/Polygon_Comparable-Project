
/**
 * Write a description of class Equilateral here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Equilateral extends Triangle
{
    public Equilateral()
    {
        super();
    }
    public Equilateral(double base, double height)
    {
        super(base, height);
    }
    
    public String getMyType()
    {
        return "Equilateral";
    }
    
    public String toString()
    {
        return "Equilateral and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
