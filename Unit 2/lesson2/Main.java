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
        
        /*  Coffee myCup = new Coffee(5,false,"no");
        System.out.println(myCup);
        
        // make a default cup of coffee
        Coffee myDefaultCup2 = new Coffee();
        System.out.println("Default "+myDefaultCup2);
        // make a default pinata
        Pinata myPinata = new Pinata();
        System.out.println("Default "+myPinata);
        
        Pinata pinata1 = new Pinata("Kit Kats","rainbow","donkey");
        System.out.println(pinata1);
        
        Pinata pinata2 = new Pinata("blue","cat");
        System.out.println(pinata2);
        
        Pinata pinata3 = new Pinata("Lemon Heads");
        System.out.println(pinata3);   */
        
        // make more pinatas to test all of the constructors you made
        
        // test each of the website constructors
        
        //complete LooseChange here
        Coins startingAmount = new Coins(4,3,2,1);
        System.out.print("Your starting amount is ");
        startingAmount.bankValue();
        startingAmount.addQuarter(2);
        startingAmount.addDime(2);
        startingAmount.addPenny(1);
        System.out.print("Your new amount is ");
        startingAmount.bankValue();
        // test Saluations here
        
        
        
        
    }
}