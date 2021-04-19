/*
Using the Die class defined in the document, Die.java, design and implement a class called PairOfDice, 
composed of two Die objects. Include methods to set and get the individual die values, a method to 
roll the dice, and a method that returns the current sum of the two die values. Create a driver class 
called RollingDice2 to instantiate and use a PairOfDice object.
*/
import java.util.Random;

/**
   The Die class simulates a six-sided die.
*/

public class Die
{
   private int sides;   // Number of sides
   private int value;   // The die's value
   
   /**
      The constructor performs an initial
      roll of the die.
      @param numSides The number of sides for this die.
   */
   
   public Die(int numSides)
   {
      sides = numSides;
      roll();
   }
   
   /**
      The roll method simlates the rolling of
      the die.
   */
   
   public void roll()
   {
      // Create a Random object.
      Random rand = new Random();
      
      // Get a random value for the die.
      value = rand.nextInt(sides) + 1;
   }
   
   /**
      getSides method
      @return The number of sides for this die.
   */
   
   public int getSides()
   {
      return sides;
   }
   
   /**
      getValue method
      @return The value of the die.
   */
   
   public int getValue()
   {
      return value;
   }
}