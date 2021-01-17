import javax.lang.model.util.ElementScanner6; 

/**
 * Author: Casey Blue
 * date: 1/16/2021
 * 
 * purpuse: creates a design of football playrs strategy runs with randomization
 * input: driver
 * output: defencive and offencive plays for each player added 
 * 
 */
public abstract class Player implements DefenceBehavior, OffenceBehavior {

    protected String name;
    private boolean defence;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;

    public Player(String name)
    {
      this.name=name;
      this.setDefenceBehavior();
      this.setOffenceBehavior();
      this.defence=false;
      /** the set up to call to each function */
    }

    public abstract void setDefenceBehavior();
    /** forces the children classes to call these functions */
    public abstract void setOffenceBehavior();

    public String play()
    {
        if(this.defence==true)
        {
            if(this.defenceBehavior==null)
                return "is not playing";
            else
             return this.defenceBehavior.play();
        } 
        else
        {
            if(this.offenceBehavior==null)
             return "is not playing";
            else
              return this.offenceBehavior.play();
            
        }   
        /** 
         * Checks if the players are on defence and forces the play to run out
         */
    }

    public void turnover()
    {
        defence=true;
        /**
         * makes defence into a true boolean to symbolize that it went from offence to defence
         */
    }
}