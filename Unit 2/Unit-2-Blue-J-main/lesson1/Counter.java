package lesson1;


/**
 * Write a description of class Counter here.
 *
 * @author (Eshaan Rana)
 * @version (9/30/2024)
 */
public class Counter
{
    // instance variables - replace the example below with your own
    private int value;

    /**
     * Constructor for objects of class Counter
     */
    public Counter()
    {
        // initialise instance variables
        value = 0;
    }
    
    public int getValue(){
        return value;
    }
    
    public void click(){
        value += 1;
    }
    
    public void reset(){
        value = 0;  
    }
    
}
