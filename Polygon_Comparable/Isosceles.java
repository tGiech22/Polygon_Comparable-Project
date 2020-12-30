
public class Isosceles extends Triangle
{
    public Isosceles()
    {
        super();
    }
    public Isosceles(double base, double height)
    {
        super(base, height);
    }
    
    public String getMyType()
    {
        return "Isosceles";
    }
    
    public String toString()
    {
        return "Isosceles and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
}
