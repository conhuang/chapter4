
/**
 * Write a description of class BandTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class BandTest{
   public static void main(String[]args){
       System.out.print("Enter the name of the band booster: ");
       Scanner scan = new Scanner (System.in);
       String booster1 = scan.nextLine();
       BandBooster b1 = new BandBooster(booster1);
       System.out.print("Enter the name of the band booster: ");
       String booster2 = scan.nextLine();
       BandBooster b2 = new BandBooster(booster2);
       
       System.out.print("\nEnter the number of boxes sold by "+booster1+ " for week 1: ");
       int x = scan.nextInt();
       b1.updateSales(x);
       System.out.print("Enter the number of boxes sold by "+booster1+ " for week 2: ");
       x = scan.nextInt();
       b1.updateSales(x);
       System.out.print("Enter the number of boxes sold by "+booster1+ " for week 3: ");
       x = scan.nextInt();
       b1.updateSales(x);
       
       System.out.print("\nEnter the number of boxes sold by "+booster2+ " for week 1: ");
       x = scan.nextInt();
       b2.updateSales(x);
       System.out.print("Enter the number of boxes sold by "+booster2+ " for week 2: ");
       x = scan.nextInt();
       b2.updateSales(x);
       System.out.print("Enter the number of boxes sold by "+booster2+ " for week 3: ");
       x = scan.nextInt();
       b2.updateSales(x);
       
       System.out.println("\n"+b1.toString()+"\n"+b2.toString());
   }
}
