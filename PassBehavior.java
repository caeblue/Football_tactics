import java.util.Random;
public class PassBehavior implements OffenceBehavior {

    Random temp = new Random();
    public String play(){

     
     int i=temp.nextInt(4);

      if (i==0)
      {
        return "throws a slant route";
      }
      if (i==1)
      {
          return "throws a out route";
      }
      if (i==2)
      {
          return "throws a seem route";
      }
      if (i==3)
      {
          return "throws a screen pass";
      }
      else
      {
        return "throws a hail mary";
      }
    }
}
