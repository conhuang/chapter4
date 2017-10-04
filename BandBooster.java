
/**
 * Write a description of class BandBooster here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BandBooster
{
    // instance variables - replace the example below with your own
    public String name;
    public int boxesSold;

    /**
     * Constructor for objects of class BandBooster
     */
    public BandBooster(String studentName)
    {
        name=studentName;
        boxesSold=0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName()
    {
        return name;
    }
    /**
     * 
     */
    public void updateSales(int x)
    {
        boxesSold += x;
    }
    /**
     * 
     */
    public String toString()
    {
        String last = name + " sold "+boxesSold+" boxes.";
        return last;
    }
}
