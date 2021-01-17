import java.util.Random;
public class BlockBehavior implements DefenceBehavior {

    /**
     * a random int generator allows to randomize the play outcomes, set for a 0-3 upper bound 
     */
    Random temp = new Random();
    public String play(){

     
     int i=temp.nextInt(3);

      if (i==0)
      {
        return "blocks a kick";
      }
      if (i==1)
      {
          return "blocks a punt";
      }
      if (i==2)
      {
          return "blocks a pass";
      }
      else
      {
        return "blocks a catch";
      }
    }
}
