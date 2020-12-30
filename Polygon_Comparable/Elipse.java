
/**
 * Write a description of class Elipse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Elipse extends Rounds
{
    private double shortSide;
    private double longSide;
    
    public Elipse()
    {
        this.shortSide = shortSide;
        this.longSide = longSide;
    }
    public Elipse(double a, double b)
    {
        this.shortSide = a;
        this.longSide = b;
    }
    
    public String getMyType()
    {
        return "Elipse";
    }
    
    public double getMyShortSide()
    {
        return shortSide;
    }
    public double getMyLongSide()
    {
        return longSide;
    }
    
    public void setMyShortSide(double a)
    {
        shortSide = a;
    }
    public void setMyLongSide(double b)
    {
        longSide = b;
    }
    
    public void calculateArea()
    {
        this.setMyArea(Math.PI * shortSide * longSide);
    }
    
    public String toString()
    {
        return "Elipse and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
