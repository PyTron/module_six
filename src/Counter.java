/*
Define a class called Counter. An object of this class is used to count things so 
it records a count that is a non-negative whole number. Include methods to set the counter to 0, 
to increase the counter by 1, and to decrease the counter by 1. Be sure that no method allows the 
value of the counter to become negative. Also include an accessor method that returns the current 
count value, as well as a method that displays the count on the screen. Do not define an input method.
 The only method that can set the counter is the one that sets it to zero. Write a program to test 
 your class definition. (Hint: you need only one instance variable).
*/
public class Counter {
    int counter;
public Counter(){
    counter = 0;
}
public void toZero(){
    counter = 0;
}
public void incCounter(){
    counter++;
}
public void decCounter(){
    if(counter>0)
    counter--;
}
public int valCounter(){
    return counter;
}
public void dispCounter(){
    System.out.print(counter);
}
}
