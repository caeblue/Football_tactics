import java.util.Random;
public class BlockBehavior implements DefenceBehavior {

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
