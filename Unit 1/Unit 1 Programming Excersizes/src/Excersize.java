import java.util.Scanner;

public class Excersize{
    public static void main(String[] args){
        //yes, this doesn't look right when you print
        //printf makes you add everything, even line breaks
        //you have full control
        rectangle();
        numberInfo();
        accountBalance();

    }

    public static void rectangle(){
        Scanner input = new Scanner(System.in);
        int probNum = 1;
        System.out.printf("Problem Number %d",probNum);
        System.out.println(" ");
        System.out.print("Please enter the rectangle's length: ");
        double length = input.nextInt();
        System.out.println(" ");
        System.out.print("Please enter the rectangle's width: ");
        double width = input.nextInt();
        System.out.println(" ");
        double perimeter = length+width+length+width;
        double area = length*width;
        double lengthSquare = length * length;
        double widthSquare = width * width;
        double diagonal = Math.sqrt(lengthSquare+widthSquare);
        System.out.println("The perimeter of the rectangle is "+perimeter);
        System.out.println("The area of the rectangle is "+area);
        System.out.printf("The diagonal of the rectangle is %.2f",diagonal);
        System.out.println(" ");

    }

    public static void numberInfo(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numOne = scan.nextInt();
        System.out.print("Enter another number: ");
        int numTwo = scan.nextInt();
        int sum = numOne + numTwo;
        int difference = numOne - numTwo;
        int product = numOne * numTwo;
        double average = (double)sum/2;
        int distance = Math.abs(difference);
        int max = Math.max(numOne,numTwo);
        int min = Math.min(numOne,numTwo);

        System.out.printf("Sum:%d\nDifference:%1d\nProduct:%1d" +
                        "\nAverage:%1f" +
                        "\nDistance:%1d" +
                        "\nMaximum:%1d" +
                        "\nMinimum:%1d",
                sum,difference,product,average,distance,max,min);
    }
    public static double accountBalance() {
        Scanner scan = new Scanner(System.in);
        System.out.printf("%n");
        System.out.printf("Please enter the initial balance: ");
        double balance = scan.nextDouble();
        System.out.printf("Please enter the annual interest rate in percentage: ");
        double rate = scan.nextDouble();
        rate *= 0.01;
        double monthRate = rate / 12;

        System.out.printf("Initial balance: $%.2f%n", balance);
        System.out.printf("Annual interest rate: %.2f%%%n", rate * 100);
        System.out.printf("Monthly interest rate: %.2f%%%n", monthRate * 100);
        double month1 = calculateNewBalance(balance, monthRate, 1);
        double month2 = calculateNewBalance(balance, monthRate, 2);
        double month3 = calculateNewBalance(balance, monthRate, 3);
        double month4 = calculateNewBalance(balance, monthRate, 4);
        double month5 = calculateNewBalance(balance, monthRate, 5);
        double month6 = calculateNewBalance(balance, monthRate, 6);
        System.out.printf("Initial balance:%.2f\nAnnual interest rate in percentage:%.2f\n" +
                        "\nMonth 1:%.2f" +
                        "\nMonth 2:%.2f" +
                        "\nMonth 3:%.2f" +
                        "\nMonth 4:%.2f" +
                        "\nMonth 5:%.2f" +
                        "\nMonth 6:%.2f",
                balance, rate, balance, month1, month2, month3, month4, month5, month6);
        return month6;
    }

    private static double calculateNewBalance(double balance, double monthRate, int months) {
        return balance * Math.pow(1 + monthRate, months);
    }
}
