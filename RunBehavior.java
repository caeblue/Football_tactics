import java.util.Random;
public class RunBehavior implements OffenceBehavior{

    Random temp = new Random();
    public String play(){

     
     int i=temp.nextInt(3);

      if (i==0)
      {
        return "drives up the gut";
      }
      if (i==1)
      {
          return "drives a draw";
      }
      if (i==2)
      {
          return "drives a pitch";
      }
      else
      {
        return "drives a reverse";
      }
    }
    
}
