
/**
 * Creates objects that stores full names
 *
 * @author Connie Huang
 * @version 10/10/2017
 */
public class Name
{
    // instance variables - replace the example below with your own
    public String first;
    public String middle;
    public String last;

    /**
     * Constructor for objects of class Name
     * @param f first name
     * @param m middle name
     * @param l last name
     */
    public Name(String f, String m, String l)
    {
        first = f;
        middle = m;
        last = l;
    }
    /**
     * @return returns first name
     */
    public String getFirst()
    {
        return first;
    }
    /**
     * @return returns middle name
     */
    public String getMiddle()
    {
        return middle;
    }
    /**
     * @return returns last name
     */
    public String getLast()
    {
        return last;
    }
    /**
     * @return returns a string containing the first, middle
     * and last name
     */
    public String firstMiddleLast()
    {
        return first + " " + middle + " " + last;
    }
    /**
     * @return returns a string with the last name followed by a comma 
     * then the first and middle names
     */
    public String lastMiddleFirst()
    {
        return last + ", " +first + " " + middle;
    }
    /**
     * checks to see if two names are the same
     * @return returns true if two names match
     */
    public boolean equals(Name otherName)
    {
        if (firstMiddleLast().equalsIgnoreCase(otherName.firstMiddleLast()))
            return true;
        else
            return false;
    }
    /**
     * @return returns initials of the name object
     */
    public String initials()
    {
        return first.toUpperCase().substring(0,1) +
               middle.toUpperCase().substring(0,1)+ 
               last.toUpperCase().substring(0,1);
    }
    /**
     * @return returns length of name
     */
    public int length()
    {
        String name = first+middle+last;
        return name.length();
    }
}
