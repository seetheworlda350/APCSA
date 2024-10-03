package User_Input;
import java.util.*;

public class UserInput{
    public static void main(String[] args){
        //Step 1: Make a scanner object
        // <type> name = value
        Scanner input = new Scanner(System.in);
        
        //Step 2: make a variable to hold input
        //double highTemp = 0;
        
        //Step 3: get input (usually prompt user first)
        //System.out.print("What is the high temp today? ");
        //highTemp = input.nextDouble();
        //System.out.println("Wow "+highTemp+" is warm!");
        
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println();
        System.out.println("What is the right amount of cats to own? ");
        int numCats = input.nextInt();
        input.nextLine(); //flush buffer after getting int because when going from int to string doesnt work
        //only string to int works without buffer flush
        System.out.println("Enter your favorite taco filling: ");
        String tacoFilling = input.nextLine();
        System.out.println( "true or false: Millie and Winston are the cutest cats");
        boolean catCute = input.nextBoolean();
    }
}
