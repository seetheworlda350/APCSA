package lesson2;


public class Pinata
{
    // Instance variables
    private String candy;    // what kind of candy is inside
    private String color;    
    private String shape;
    
    // Constructor without parameters
    public Pinata()
    {
        candy = "hard candy";
        color = "rainbow";
        shape = "donkey";
    }
    // Add an overloaded constructor that allows the user
    // to customize all of the instance variables
    public Pinata(String pinataCandy, String pinataColor, String pinataShape){
        candy = pinataCandy;
        color = pinataColor;
        shape = pinataShape;
    }
    // Add an overloaded constructor that allows the user
    // to customize the color and shape
    public Pinata(String pinataColor, String pinataShape){
        color = pinataColor;
        candy = "Twix";
        shape = pinataShape;
    }
    // Add an overloaded constructor that allows the user
    // to customize the candy
    public Pinata(String pinataCandy){
        shape = "rabbit";
        color = "blue";
        candy = pinataCandy;
    }
    
    public String toString()
    {
        return color + " " + shape + " pinata filled with " + candy;
    }
}