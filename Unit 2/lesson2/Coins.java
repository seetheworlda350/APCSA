package lesson2;

public class Coins {

    private int quarters;
    private int dimes;
    private int nickels;
    private int pennies;

    public Coins(int numQuarters, int numDimes, int numNickels, int numPennies){
        quarters = numQuarters;
        dimes = numDimes;
        nickels = numNickels;
        pennies = numPennies;
    }

    public void addQuarter(int numQuarters){
        if(numQuarters == 1){
            System.out.println("Adding a quarter ...");
        }else{
            System.out.printf("Adding %d quarters ...\n",numQuarters);
        }
        quarters += numQuarters;
    }

    public void addDime(int numDimes){
        if(numDimes == 1){
            System.out.println("Adding a dime ...");
        }else{
            System.out.printf("Adding %d dimes ...\n",numDimes);
        }
        dimes += numDimes;
    }

    public void addNickel(int numNickels){
        if(numNickels == 1){
            System.out.println("Adding a nickel ...");
        }else{
            System.out.printf("Adding %d nickels ...\n",numNickels);
        }
        nickels += numNickels;
    }

    public void addPenny(int numPenny){
        if(numPenny == 1){
            System.out.println("Adding a penny ...");
        }else{
            System.out.printf("Adding %d pennys ...\n",numPenny);
        }
        pennies += numPenny;
    }

    public void quartersCount(){
        System.out.println(quarters);
    }

    public void quartersTotal(){
        System.out.println(quarters * 0.25);
    }

    public void dimesCount(){
        System.out.println(dimes);
    }

    public void dimesTotal(){
        System.out.println(dimes * 0.10);
    }

    public void nickelsCount(){
        System.out.println(nickels);
    }

    public void nickelsTotal(){
        System.out.println(nickels * 0.05);
    }

    public void penniesCount(){
        System.out.println(pennies);
    }

    public void penniesTotal(){
        System.out.println(pennies * 0.01);
    }

    public void bankValue(){
        double value = quarters * 0.25 + dimes * 0.10
            + nickels * 0.05 + pennies * 0.01;
        System.out.printf("$ %.2f", value);
        System.out.println(" ");
    }

    public void bankCount(){
        System.out.println(quarters + dimes + nickels + pennies);
    }
    
    public String toString()
    {
        return "Quaters "+ quarters + ", dimes " + dimes + ", nickels " + nickels+", pennies " + pennies;
    }
}


