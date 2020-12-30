
/**
 * Write a description of class Kite here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rhombus extends Quadrilaterals
{
    public Rhombus()
    {
        super();
    }
    public Rhombus(double myHeight, double myBase1, double myBase2)
    {
        super(myHeight, myBase1, myBase2);
    }
    
    public String getMyType()
    {
        return "Rhombus";
    }
    
    public void calculateArea()
    {
        double a = ((this.getMyHeight() * this.getMyBase1()) / 2);
        
        this.setMyArea(a);
    }
    
    public String toString()
    {
        return "Rhombus and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
