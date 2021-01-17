import javax.lang.model.util.ElementScanner6;

public abstract class Player implements DefenceBehavior, OffenceBehavior {

    protected String name;
    private boolean defence;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;

    public Player(String name)
    {
      this.name=name;
      this.defence=defence;
    }

    public abstract void setDefenceBehavior();

    public abstract void setOffenceBehavior();

    public String play()
    {
        
    }

    public void turnover()
    {
        if(defence==true)
        {
            defence=false;
        }
        else
        {
            defence=true;
        }
        
    }
}