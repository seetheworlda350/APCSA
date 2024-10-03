            package lesson2;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        // Note: These classes have been written so that you can
        // print the object using System.out.println(objectName)
        
        // make a custom cup of coffee
        Coffee myCup = new Coffee(5,false,"no");
        System.out.println(myCup);
        
        // make a default cup of coffee
        Coffee myDefaultCup2 = new Coffee();
        System.out.println("Default "+myDefaultCup2);
        // make a default pinata
        Pinata myPinata = new Pinata();
        System.out.println(myPinata);
        
        Pinata pinata1 = new Pinata("hard","rainbow","donkey");
        System.out.println(pinata1);
        
        Pinata pinata2 = new Pinata("green","soft");
        System.out.println(pinata2);
        
        Pinata pinata3 = new Pinata("giraffe");
        System.out.println(pinata3);
        
        // make more pinatas to test all of the constructors you made
        
        // test each of the website constructors
        
        //complete LooseChange here
        
        // test Saluations here
        
        
        
        
    }
}