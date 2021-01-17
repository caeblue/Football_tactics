import java.util.Random;
public class ReceiverBehavior implements OffenceBehavior
{
   /**
     * a random int generator allows to randomize the play outcomes
     */
    Random temp = new Random();
    public String play(){

     
     int i=temp.nextInt(4);

      if (i==0)
      {
        return "Runs a slant route";
      }
      if (i==1)
      {
          return "Runs a out route";
      }
      if (i==2)
      {
          return "Runs a seem route";
      }
      if (i==3)
      {
          return "Runs a screen pass";
      }
      else
      {
        return "runs a hail mary";
      }
    }
}
