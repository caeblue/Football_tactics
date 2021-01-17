public class Receiver extends Player {

    public Receiver(String name)
    {
       super(name);
    }
    
    public void setOffenceBehavior()
    {
        offenceBehavior = new ReceiverBehavior();
    }

    public void setDefenceBehavior()
    {
        //returns null
        defenceBehavior=null;
    }
}
