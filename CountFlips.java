/**
 * Race between two coins to see which one flips 3 heads in a row
 * @author Connie Huang
 * @version 10/3/2017
 */

public class CountFlips
{
    public static void main (String[] args)
    {
        final int FLIPS = 10; 
        int c1heads = 0, c2heads = 0, flips = 0; //holds number of heads and tails

        Coin c1 = new Coin(); // creates coin object calls Coin() method 
        Coin c2 = new Coin();
        System.out.println ("\fWhich coin can reach 3 heads first?\n\n"  
                            +"Initial flip c1: " + c1 +"\nInitial flip c2: "+c2);

        System.out.println("\n  C1\t  C2");
        System.out.println("------\t------");
        // Flip the coin FLIPS times
        /*
        for (int i = 0; i < FLIPS; i++)
        {
        c1.flip();
        c2.flip();
        System.out.println (c1+"\t"+c2);
        if(c1.isHeads())
        heads++;
        else
        tails++;
        }

        System.out.println("\nThe number of flips: " +FLIPS);
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
         */
        while (c1heads != 3 && c2heads != 3){
            c1.flip();
            c2.flip();
            System.out.println (c1+"\t"+c2);
            if (c1.isHeads())
                c1heads++;
            else
                c1heads = 0;
            if (c2.isHeads())
                c2heads++;
            else
                c2heads=0;
                flips++;
        }
        if (c1heads == c2heads)
            System.out.println ("\nIt's a tie! C1 and C2 flipped 3 heads in a row.");
        else if (c1heads < c2heads)
            System.out.println ("\nC2 wins!");
        else
            System.out.println("\nC1 wins");
        System.out.println (flips+ " flips.");
    }
}
