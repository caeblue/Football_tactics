import java.util.Random;
public class QuarterBack extends Player{

    public QuarterBack(String name)
    {
        super(name);
    }
    Random temp = new Random();
    int i = temp.nextInt(5);
    public void setOffenceBehavior()
    {
    
          if (i==0)
          {
             offenceBehavior= new RunBehavior();
          }
          else
          {
           offenceBehavior= new PassBehavior();
          }
    }
    
    public void setDefenceBehavior()
    {
        //returns null
        defenceBehavior=null;
    }
}
