/**
 *  Coin.java            Author: Lewis and Loftus
 *
 *   Represents a coin with two sides that can be flipped.
 **/

public class Coin
{
    public static final int HEADS = 0;
    public static final int TAILS = 1;

    private int face;

    /**
     * constructor method. Called when Coin() is executed.
     */
    public Coin ()
    {
        flip();
    }

    /**
     * method randomly generates heads or tails
     */
    public void flip()
    {
        face = (int) (Math.random() * 2);
    }

    /**
     * Method to evaluate face of coin. Returns 'true' if coin is facing heads up
     * 
     * @return true if coin is heads, false is coin is tails
     */
    public boolean isHeads()
    {
        return (face == HEADS);
    }

    /**
     * Returns string representation of coin object. Every
     * class you write, should have a toString() method.
     * 
     * @return string representation of a Coin object
     */
    
    public String toString()
    {
        String faceName; // only exists in method. will be deleted when method is done.

        if (isHeads())
            faceName = "Heads";
        else
            faceName = "Tails";

        return faceName;
    }
    
}
