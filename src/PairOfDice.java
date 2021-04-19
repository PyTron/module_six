/*
Using the Die class defined in the document, Die.java, design and implement a class called PairOfDice, 
composed of two Die objects. Include methods to set and get the individual die values, a method to 
roll the dice, and a method that returns the current sum of the two die values. Create a driver class 
called RollingDice2 to instantiate and use a PairOfDice object.
*/
public class PairOfDice {
    Die dieOne = new Die(6);
    Die dieTwo = new Die(6);
        public void rollDice(){
            dieOne.roll();
            dieTwo.roll();
        }
        public int addDice(){
            return dieOne.getValue() + dieTwo.getValue();
        }
        public void setDieOne(int a){
        if(a>0 && a <= dieOne.getSides()){
        while(dieOne.getValue() !=a){
            dieOne.roll();
        }
        }
        }
        public int getDieOne(){
            return dieOne.getValue();
        }
        public void setDieTwo(int a){
            if(a>0 && a <= dieTwo.getSides()){
            while(dieTwo.getValue() !=a){
                dieTwo.roll();
            }
        }
        }
        public int getDieTwo(){
            return dieTwo.getValue();
        }

}
