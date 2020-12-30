
/**
 * Write a description of class Parallelogram here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Parallelogram extends Quadrilaterals
{
    public Parallelogram()
    {
        super();
    }
    public Parallelogram(double myHeight, double myBase1, double myBase2)
    {
        super(myHeight, myBase1, myBase2);
    }
    
    public String getMyType()
    {
        return "Parallelogram";
    }
    
    public String toString()
    {
        return "Parallelogram and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
