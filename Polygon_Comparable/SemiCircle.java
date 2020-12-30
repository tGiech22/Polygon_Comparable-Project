
/**
 * Write a description of class SemiCircle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SemiCircle extends Rounds
{
    public SemiCircle()
    {
        super();
    }
    public SemiCircle(double radius)
    {
        super(radius);
    }
    
    public String getMyType()
    {
        return "SemiCircle";
    }
    
    public void calculateArea()
    {
        this.setMyArea((Math.pow(getMyRadius(), 2) * Math.PI) / 2);
    }
    
    public String toString()
    {
        return "SemiCircle and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
