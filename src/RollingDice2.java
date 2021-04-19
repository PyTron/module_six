import java.util.Scanner;
public class RollingDice2{
    public static void main(String[] args){
       PairOfDice pairOne = new PairOfDice();
       Scanner input = new Scanner(System.in);
        pairOne.rollDice();
        System.out.println("The value of the combined Dice is " + pairOne.addDice()); 
        
        System.out.println("The value of die one is " + pairOne.getDieOne());
        System.out.print("Enter a new value for Dice One ");
        int a = input.nextInt();
        pairOne.setDieOne(a);
        System.out.println("The new value of die one is " + pairOne.getDieOne());

        System.out.println("The value of die two is " + pairOne.getDieTwo());
        System.out.print("Enter a new value for Dice Two ");
        a = input.nextInt();
        pairOne.setDieTwo(a);
        System.out.println("The new value of die Two is " + pairOne.getDieTwo());

        System.out.println("The new value of the combined Dice is " + pairOne.addDice());
    }
}