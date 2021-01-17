import java.util.Random;
public class Lineman extends Player{
    
    public Lineman(String name)
    {
        super(name);
    }
    
    public void setOffenceBehavior()
    {
        offenceBehavior= new OBlockBehavior();
    }

    Random temp = new Random();
    int i=temp.nextInt(3);
    
    public void setDefenceBehavior()
    {
       
    
        if (i==0)
        {
           defenceBehavior= new StripBehavior();
        }
        if(i==2)
        {
            defenceBehavior= new BlockBehavior();
        }
        else
        {
            defenceBehavior= new SackBehavior();
        }
    }
    
}
