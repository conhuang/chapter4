/**
 * CoinTest.java
 *
 * Finds the length of the longest run of heads in 100 flips of a coin.
 */

public class CoinTest
{
    public static void main (String[] args)
    {
        final int FLIPS = 100; // number of coin flips

        int currentRun = 0; // length of the current run of HEADS
        int maxRun = 0;     // length of the maximum run so far

        Coin c1 = new Coin();// Create a coin object

        // Flip the coin FLIPS times
        for (int i = 0; i < FLIPS; i++)
        {
            c1.flip();// Flip the coin & print the result
            System.out.println(c1);

            if (c1.isHeads()){
                currentRun++;
            }else {
                if (currentRun>maxRun)
                    maxRun=currentRun;
                currentRun=0;
            }
            

        }
        System.out.println ("The maximum run of heads was " + maxRun + ".");
    }
}
