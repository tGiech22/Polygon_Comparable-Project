
/**
 * Write a description of class Trapezium here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Trapezium extends Trapezoid
{
    public Trapezium()
    {
        super();
    }
    public Trapezium(double myHeight, double myBase1, double myBase2)
    {
        super(myHeight, myBase1, myBase2);
    }
    
    public String getMyType()
    {
        return "Trapezium";
    }

    public String toString()
    {
        return "Trapezium and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
