
/**
 * Write a description of class NameTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class NameTest{
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("\fPlease enter the name of person #1 (first middle last): ");
        String a = scan.next();
        String b = scan.next();
        String c = scan.next();
        Name n1 = new Name(a, b, c);
        
        System.out.println("Please enter the name of person #2 (first middle last): ");
        a = scan.next();
        b = scan.next();
        c = scan.next();
        Name n2 = new Name(a, b, c);
        
        System.out.println ("\n" + n1.firstMiddleLast() + "\n"+n1.lastMiddleFirst()+
        "\n"+ n1.initials() + "\nThe name length is " +n1.length());
        System.out.println ("\n" + n2.firstMiddleLast() + "\n"+n2.lastMiddleFirst()+
        "\n" + n2.initials() + "\nThe name length is " +n2.length());
        if (n1.equals(n2))
            System.out.println ("\nThe names are the same.");
        else
            System.out.println ("\nThe names are different.");
    }
}
