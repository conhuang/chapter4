
/**
 * Write a description of class Name here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
    public String getFirst()
    {
        return first;
    }
    public String getMiddle()
    {
        return middle;
    }
    public String getLast()
    {
        return last;
    }
    public String firstMiddleLast()
    {
        return first + " " + middle + " " + last;
    }
    public String lastMiddleFirst()
    {
        return last + ", " +first + " " + middle;
    }
    public boolean equals(Name otherName)
    {
        if (firstMiddleLast().equalsIgnoreCase(otherName.firstMiddleLast()))
            return true;
        else
            return false;
    }
    public String initials()
    {
        return first.toUpperCase().substring(0,1) +
               middle.toUpperCase().substring(0,1)+ 
               last.toUpperCase().substring(0,1);
    }
    public int length()
    {
        String name = first+middle+last;
        return name.length();
    }
}
