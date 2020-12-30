
/**
 * Write a description of class Trapezoid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Trapezoid extends Quadrilaterals
{
    public Trapezoid()
    {
        super();
    }
    public Trapezoid(double myHeight, double myBase1, double myBase2)
    {
        super(myHeight, myBase1, myBase2);
    }
    
    public String getMyType()
    {
        return "Trapezoid";
    }
    
    public void calculateArea()
    {
        double a = (this.getMyHeight() * (this.getMyBase1() + this.getMyBase2()) * 0.5);
        
        this.setMyArea(a);
    }
    
    public String toString()
    {
        return "Trapezoid and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
