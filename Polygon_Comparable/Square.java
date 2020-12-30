
/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square extends Quadrilaterals
{
    public Square() 
    {
        super();
    }
    public Square(double height, double base1, double base2)
    {
        super(height, base1, base2);
    }
    
    public String getMyType()
    {
        return "Square";
    }
    
    public String toString()
    {
        return "Square and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
