/**
 * Mr. Marques
 *  Agon is "abstract" because you can NOT have 'just' a Agon. It has to
 *  be of a certain type. This is why there are no abstract methods in this abstract
 *  class.
 */

/* 
   (1) Write the abstract 'Agon' class and have it implement 'Polygon_Comparable'
   (2) Declare 2 instance variables all of type double: mySideLength and myArea.
   (3) Declare another variable MY_NUM_SIDES as a final int.
   (4) Write 2 constructors: (a) the default (b) another that takes in the number
       of 'sides' and the 'length'. Define MY_NUM_SIDES to equal 'sides'.
   (4) Use set-methods in the constructors to set the variables values.
   (5) Write/implement getMyCategory() returns "Agon"
         NOTE: Write/implement getMyType() in EACH of the subclasses and NOT here!
   (6) Write 'compareTo()' which compares 2 polygons via their area.
*/

public abstract class Agon implements Polygon_Comparable 
{
    // Instance variables
   // >>>>>>>>>>>>>> YOUR CODE HERE <<<<<<<<<<<<<<<<<<<<
   private double mySideLength;
   private double myArea;
   private final int MY_NUM_SIDES;

   // *********** Constructors ****************
       // >>>>>>>>>>>>>> YOUR CODE HERE <<<<<<<<<<<<<<<<<<<<
   public Agon(int sides, double length)
   {
       MY_NUM_SIDES = sides;
       mySideLength = length;
       this.myArea = myArea;
   }
   public Agon()
   {
       this.mySideLength = mySideLength;
       this.myArea = myArea;
       this.MY_NUM_SIDES = 0;
   }
    // ************ abstract method(s) & the overiding of such ************
       // >>>>>>>>>>>>>> YOUR CODE HERE <<<<<<<<<<<<<<<<<<<<
    public String getMyCategory()
    {
        return "Agon";
    }
       
    // ********************* Assessor and Mutator methods *************************
    public double getMyArea()
    {
        calculateArea();  // Always calculateArea() first.
        return myArea;
    }
    public double getMyNumSides()
    {
        return MY_NUM_SIDES;
    }
    public double getMySideLength()
    {
        return mySideLength;
    }
    public void setMySideLength(double s)
    {
        mySideLength = s;
    }
    public void calculateArea()
    {
        myArea = 1.0/4 * MY_NUM_SIDES * Math.pow(mySideLength,2) * (1.0/ Math.tan(Math.PI / MY_NUM_SIDES));
    }
     
     
    // ************************* compareTo() *************************************
         // >>>>>>>>>>>>>> YOUR CODE HERE <<<<<<<<<<<<<<<<<<<<
    public int compareTo(Polygon_Comparable a)
    {
        return (int) (this.getMyArea() - a.getMyArea());
    }   
         
    // ************************** toString() ******************************
    public String toString() 
    { 
        return "Agon and I am also a Polygon_Comparable";
    }    
}
