
/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle extends Quadrilaterals
{
    public Rectangle()
    {
        super();
    }
    public Rectangle(double myHeight, double myBase1, double myBase2)
    {
        super(myHeight, myBase1, myBase2);
    }
    
    public String getMyType()
    {
        return "Rectangle";
    }
    
    public String toString()
    {
        return "Rectangle and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
