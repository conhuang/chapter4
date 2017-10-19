
/**
 * Write a description of class FinchSecurity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import edu.cmu.ri.createlab.terk.robot.finch.Finch;
public class FinchSecurity
{
    public static void main(final String[] args)
    {
        Finch myFinch = new Finch();
        while (myFinch.isFinchLevel())
        {
            if (myFinch.isObstacle())
            {
                while (myFinch.isObstacle()){
                    myFinch.sleep(250);
                    myFinch.setLED(255,0,0,2500);
                }
            }
            else{
                while (!myFinch.isObstacle()){
                    myFinch.setWheelVelocities(-100,100);
                    myFinch.setLED(0,102,102,250);
                    myFinch.setLED(255,51,153,250);
                    myFinch.setLED(255,128,0,250);
                    myFinch.setLED(153,51,255,250);
                    myFinch.saySomething("warning",10000);
                    
                }
            }
        }

        myFinch.quit();
        System.exit(0);
    }
}
